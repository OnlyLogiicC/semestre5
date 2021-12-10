package fr.ensma.a3.ia;


import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

import com.google.gson.Gson;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;


public class Send {
	
	
	
    public static void main( String[] args ) throws IOException, TimeoutException, KeyManagementException, NoSuchAlgorithmException, URISyntaxException, InterruptedException
    {
    	while (true) {
    		ConnectionFactory factory = new ConnectionFactory() ;
    		factory.setUri("amqp://localhost:5672");
	        Connection connection = factory.newConnection() ;
	        Channel channel = connection.createChannel() ;
	        Gson gson = new Gson() ;
	        System.out.println(gson.toJson("test"));
	        try {
				channel.basicPublish("test_echange", "fanout", null,"test".getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
	        Thread.sleep(5000) ;
    	}
        
        
        
    }
}
