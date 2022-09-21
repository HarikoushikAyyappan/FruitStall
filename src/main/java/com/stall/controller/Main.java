package com.stall.controller;
import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

import com.stall.model.Fruits;
import com.stall.service.FruitService;
import com.stall.service.FruitServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
    public static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws IOException {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Fruits apple = (Fruits) context.getBean("apple");
        Fruits mango = (Fruits) context.getBean("mango");
        Fruits grape = (Fruits) context.getBean("grapes");
       // getFruitsById();
    }

private static void getFruitsById()
{
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    FruitService fruit4 = (FruitService) context.getBean("fruit4");
   /*LOGGER.info(fruit4.getAppleById("one"));
    LOGGER.info(fruit4.getMangoById("two"));
    LOGGER.info(fruit4.getGrapesById("three"));*/

}

}
