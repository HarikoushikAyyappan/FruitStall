package com.stall.service;

import java.io.*;
import java.util.Properties;
import com.stall.controller.Main;
import com.stall.model.Fruits;
import com.stall.model.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class FruitServiceImplementation implements FruitService {
    public String getFruitsNameById(String id) throws IOException {
        //Fruits fruits = new Fruits();
        Properties properties = new Properties();
        FileOutputStream outputStrem = new FileOutputStream("info.properties");
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = loader.getResourceAsStream("info.properties");
        properties.load(inputStream);
        return properties.getProperty(id);
    }

    public String addFruits(Fruits fruits) throws IOException {
        Properties properties = new Properties();
        properties.put(fruits.getId(), fruits.getFruitName());
        String path = "C:/Users/harikoushik.an/IdeaProjects/Shop/src/main/resources/info.properties";
        FileOutputStream outputStrem = new FileOutputStream(path);
        properties.store(outputStrem, null);
        System.out.println("Properties file created......");
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = loader.getResourceAsStream("info.properties");
        properties.load(inputStream);
        return properties.getProperty(fruits.getId());
    }

    public Fruits updateFruits(Fruits fruits) throws IOException {
        Properties properties = new Properties();
        properties.put(fruits.getId(), fruits.getFruitName());
        String path = "C:/Users/harikoushik.an/IdeaProjects/Shop/src/main/resources/info.properties";
        FileOutputStream outputStrem = new FileOutputStream(path);
        properties.store(outputStrem, null);
        return fruits;

    }

    public void deleteFruits(String id) throws IOException {
        Properties properties = new Properties();
        String path = "C:/Users/harikoushik.an/IdeaProjects/Shop/src/main/resources/info.properties";
        properties.remove(id);
        FileOutputStream outputStrem = new FileOutputStream(path);
        properties.store(outputStrem, null);

    }
   /* public Person addPerson(@RequestBody Person person) throws IOException{
          return person;
    }
*/
    @Override
    public Fruits Response() throws Exception {
        return null;
    }
}
