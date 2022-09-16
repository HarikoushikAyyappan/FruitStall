package com.stall.service;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import com.stall.controller.Main;
public class FruitServiceImplementation implements FruitService {
    public static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));
    Properties p = new Properties();
    public FruitServiceImplementation() throws IOException {

        FileReader reader = new FileReader("info.properties");
        p.load(reader);
    }

    public String  getAppleById(String apple){
        return p.getProperty(apple);

    }

    public String getMangoById(String mango){
        return p.getProperty(mango);
    }

   public String getGrapesById(String grapes){
       return p.getProperty(grapes);
    }
}
