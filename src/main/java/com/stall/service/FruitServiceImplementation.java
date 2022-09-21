package com.stall.service;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import com.stall.controller.Main;
import com.stall.model.Fruits;
import org.springframework.web.bind.annotation.PathVariable;

public class FruitServiceImplementation implements FruitService {
    public static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));

    /*public FruitServiceImplementation() throws IOException {
        Properties p = new Properties();
        FileReader reader = new FileReader("info.properties");
        p.load(reader);
    }*/

  /* *//* public String getAppleById(String apple) throws FileNotFoundException {
        Properties p = new Properties();
        FileReader reader = new FileReader("info.properties");
        p.load(reader);
        return p.getProperty(apple);

    }

    public String getMangoById(String mango) {
        return p.getProperty(mango);
    }

    public String getGrapesById(String grapes) {
        return p.getProperty(grapes)*//*;
    }*/
    public String getFruitsNameById( String key) throws IOException {
        Properties p = new Properties();
        FileReader reader = new FileReader("info.properties");
        p.load(reader);
        return p.getProperty(key);
    }
    public void addFruits(String id, String fruitName) throws IOException {
        Properties p = new Properties();
        p.setProperty(id , fruitName);
        p.store(new FileWriter("info.properties")," Properties Example");
    }
    public Fruits updateFruits(Fruits fruits) throws IOException {
        Properties p = new Properties();
        p.setProperty(fruits.getId(), String.valueOf(fruits));
        p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");
        return fruits;

    }

}
