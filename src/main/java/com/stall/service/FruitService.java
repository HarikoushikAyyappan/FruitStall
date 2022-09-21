package com.stall.service;

import com.stall.model.Fruits;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FruitService {


   /* String getAppleById(String apple) throws FileNotFoundException;

    String getMangoById(String mango);

    String getGrapesById(String grapes);*/
   String getFruitsNameById(String key) throws IOException;
    public void addFruits(String id, String fruitName) throws IOException;
     Fruits updateFruits(Fruits fruits) throws IOException;
}
