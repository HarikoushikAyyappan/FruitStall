package com.stall.controller;
import java.util.Properties;
import java.io.*;
import com.stall.model.Fruits;
import com.stall.service.FruitService;
import com.stall.service.FruitServiceImplementation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
class FruitController {
    @ResponseBody
     public void controllerDisplay() throws IOException {
      Properties p = new Properties();
     p.setProperty("fruit1.count","50");
     p.setProperty("fruit2.count","40");
     p.setProperty("fruit3.count","40");
         try {
             p.store( new FileWriter("info.properties"),"Fruits details");
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         FileReader reader = null;
         try {
             reader = new FileReader("info.properties");
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         }
         p.load(reader);
     System.out.println(p.getProperty("fruit1.count"));
     System.out.println(p.getProperty("fruit2.count"));
     System.out.println(p.getProperty("fruit3.count"));

}}
