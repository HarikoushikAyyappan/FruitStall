package com.stall.controller;
import java.util.Properties;
import java.io.*;
import com.stall.model.Fruits;
import com.stall.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;

@RestController
     @RequestMapping(value ="/fruits")
     public class FruitController {

    @Autowired
    FruitService fruitService;

          @RequestMapping(value = "/list", method = RequestMethod.GET)
          @ResponseBody
          public Fruits Response() throws Exception {
               Fruits fruitModel = new Fruits();
               Properties properties = new Properties();
               properties.load(getClass().getClassLoader().getResourceAsStream("info.properties"));
               fruitModel.setFruitName(properties.getProperty("one"));
               return fruitModel;
          }

     @RequestMapping(value = "/{id}", method = RequestMethod.GET)
           public String getFruitsNameById(@PathVariable String id) throws IOException {
          Properties properties = new Properties();
          properties.load(getClass().getClassLoader().getResourceAsStream("info.properties"));
          return properties.getProperty(id);


     }

   @RequestMapping (value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
   @ResponseBody
   @ResponseStatus(HttpStatus.OK)
   public Fruits create(@RequestBody Fruits fruitModel)
   {

       return fruitModel;
   }
   /* @RequestMapping (value = "/postByKey", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void addFruits(@RequestBody Fruits fruitObject) {
        fruitService.addFruits(fruitObject.getId(), fruitObject.getFruitName());
    }*/

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public Fruits updateFruits(@RequestBody Fruits fruits) throws IOException {
        return fruitService.updateFruits(fruits);

    }

}







