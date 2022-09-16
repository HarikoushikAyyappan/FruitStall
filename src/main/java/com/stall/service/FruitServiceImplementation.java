package com.stall.service;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import com.stall.controller.FruitController;
import com.stall.controller.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.stall.model.Fruits;

import static java.lang.System.*;

public class FruitServiceImplementation implements FruitService {
    public static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));

    public FruitServiceImplementation() throws IOException {

        p.setProperty("fruit1.count", "50");
        p.setProperty("fruit2.count", "40");
        p.setProperty("fruit3.count", "40");
        p.setProperty("fruit1.id", String.valueOf(1));
        p.setProperty("fruit2.id", String.valueOf(2));
        p.setProperty("fruit3.id", String.valueOf(3));
        p.setProperty("fruit1.fruitName", "apple");
        p.setProperty("fruit2.fruitName", "mango");
        p.setProperty("fruit3.fruitName", "grapes");
        p.store(new FileWriter("info.properties"), "Fruits details");
        FileReader reader = new FileReader("info.properties");
        p.load(reader);
    }
   Properties p = new Properties();
    public String  getAppleById(String apple){
        return p.getProperty("fruit1.fruitName");

    }

    public String getMangoById(String mango){
        return p.getProperty("fruit2.fruitName");
    }

   public String getGrapesById(String grapes){
       return p.getProperty("fruit3.fruitName");
    }
}
