package com.stall.controller;
import java.util.Properties;
import java.io.*;
import com.stall.model.Fruits;
import com.stall.model.Person;
import com.stall.service.FruitService;
import com.stall.service.SqlConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;

@RestController
     @RequestMapping(value ="/fruits")
     public class FruitController {
    @Autowired
    FruitService fruitService;
     @RequestMapping(value = "/{id}", method = RequestMethod.GET)
           public String getFruitsNameById(@PathVariable String id) throws IOException {
               // Fruits fruits = new Fruits();
              //return fruitService.getFruitsNameById(id);
                return fruitService.getFruitsNameById(id);
     }
   @RequestMapping (value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
   @ResponseBody
   @ResponseStatus(HttpStatus.OK)
   public Fruits create(@RequestBody Fruits fruitModel)
   {

       return fruitModel;
   }
   @RequestMapping (value = "/postByKey", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public String addFruits(@RequestBody Fruits fruits) throws IOException {
        return fruitService.addFruits(fruits);
    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public Fruits updateFruits(@RequestBody Fruits fruits) throws IOException {
        return fruitService.updateFruits(fruits);

    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCountry(@PathVariable("id") String id) throws IOException {
        fruitService.deleteFruits(id);

    }
    @RequestMapping (value = "/postPerson", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Person connectionFunction(@RequestBody Person person) throws IOException {
        return SqlConnection.connectionFunction(person);
    }

}







