package fr.ensma.a3.ia.types;

import com.pi4j.io.spi.SpiChannel;
import com.pi4j.io.spi.SpiDevice;
import com.pi4j.io.spi.SpiFactory;
import com.pi4j.wiringpi.Spi;

public class SPI implements  IControl{

    private Integer device, bus;
    private SpiDevice spi;

    public SPI(SpiChannel chan) {
        try {
            spi = SpiFactory.getInstance(chan);
        } catch (Exception e) {

        }
    }

    public SPI(SpiChannel chan, Integer spe) {
        try {
            spi = SpiFactory.getInstance(chan, spe);
        } catch (Exception e) {

        }
    }

    public SPI(Integer dev, Integer b) {
        device = dev;
        bus = b;
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public void open(){
        //TODO
    }

    @Override
    public void close(){
        //TODO
    }
}
