package fr.ensma.a3.ia;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class Receive {
	
	
	public static void main(String[] args) throws IOException, TimeoutException, InterruptedException, KeyManagementException, NoSuchAlgorithmException, URISyntaxException {
		
		while (true) {
			ConnectionFactory factory = new ConnectionFactory() ;
			factory.setUri("amqp://localhost:5672");
			factory.setHost("localhost") ;
			Connection connection = factory.newConnection() ;
			Channel channel = connection.createChannel() ;
			channel.exchangeDeclare("test_echange", "fanout");
			String queueName = channel.queueDeclare().getQueue();
			channel.queueBind(queueName, "test_echange", "");
			Consumer consumer = new DefaultConsumer(channel) {
				@Override
				public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
						byte[] body) throws IOException {
					String message = new String(body, "UTF-8");
					System.out.println(" [x] Received '" + message + "'");
				}
			};
			channel.basicConsume(queueName, true, consumer);
		Thread.sleep(500) ;
		}
		
		
	}
	


}
