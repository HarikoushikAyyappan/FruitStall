package com.stall.service;

import com.stall.service.FruitService;

public class FruitServiceImplementation implements FruitService {
    public String  getAppleById(){
      System.out.println("Getting apple");
      return "Apple";

    }

    public String getMangoById(){
        System.out.println("Getting mango");
      return "Mango";
    }

   public String getGrapesById(){
       System.out.println("Getting Grapes");
      return "Grapes";
    }
}
