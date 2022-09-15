package com.stall.controller;
import java.io.*;
import java.util.Properties;
import com.stall.model.Fruits;
import com.stall.service.FruitService;
import com.stall.service.FruitServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) throws IOException {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Fruits fruit1 = (Fruits) context.getBean("fruit1");
        Fruits fruit2 = (Fruits) context.getBean("fruit2");
        Fruits fruit3 = (Fruits) context.getBean("fruit3");
        //FruitServiceImplementation fruit4 = (FruitServiceImplementation) context.getBean("fruit4");
    }}
