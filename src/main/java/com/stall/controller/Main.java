package com.stall.controller;
import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

import com.stall.model.Fruits;
import com.stall.service.FruitService;
import com.stall.service.FruitServiceImplementation;
import com.stall.service.SqlConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
    public static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws IOException {
       /* ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SqlConnection connectionObject = (SqlConnection) context.getBean("connectionObject");
        connectionObject.connectionFunction();*/

    }



}
