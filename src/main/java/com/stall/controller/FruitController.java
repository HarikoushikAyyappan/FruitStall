package com.stall.controller;
import java.util.Properties;
import java.io.*;
import com.stall.model.Fruits;
import com.stall.service.FruitService;
import com.stall.service.FruitServiceImplementation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
     @RequestMapping(value ="/get")
     public class FruitController {
          @RequestMapping(value = "/fruits", method = RequestMethod.GET)
          public Fruits Response() throws Exception {
               Fruits fruitModel = new Fruits();
               Properties property = new Properties();
               InputStream is = new FileInputStream("info.properties");
               property.load(is);
               fruitModel.setFruitName(property.getProperty("Apple"));
               return fruitModel;
          }}



