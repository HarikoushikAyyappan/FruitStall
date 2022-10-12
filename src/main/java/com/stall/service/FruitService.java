//service layer code for rest api with property file
package com.stall.service;
import com.stall.model.Fruits;
import com.stall.model.Person;
import org.springframework.web.bind.annotation.RequestBody;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface FruitService {
   String getFruitsNameById(String id) throws IOException;
     String addFruits(Fruits fruits) throws IOException;
     Fruits updateFruits(Fruits fruits) throws IOException;
    void deleteFruits(String id) throws IOException;
    Fruits Response() throws Exception;
     //Person addPerson( Person person) throws IOException;
}
