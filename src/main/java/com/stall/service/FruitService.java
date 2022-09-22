package com.stall.service;

import com.stall.model.Fruits;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FruitService {
   String getFruitsNameById(String id) throws IOException;
    public String addFruits(Fruits fruits) throws IOException;
     Fruits updateFruits(Fruits fruits) throws IOException;
    void deleteFruits(String id) throws IOException;
    public Fruits Response() throws Exception;
}
