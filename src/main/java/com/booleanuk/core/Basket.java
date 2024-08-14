package com.booleanuk.core;

import java.util.HashMap;
import java.util.List;

public class Basket {

    int basketSize = 3;

    HashMap<String, Integer> bagels = new HashMap<>();

    String[] basket = new String[basketSize];

    public Boolean addBagel(String bagel){
        return true;
    }

    public Boolean removeBagel(String bagel){
        return true;
    }

    public Boolean setBasketSize(int basketSize){
        return true;
    }

    public int getBasketSize(){
        return basketSize;
    }

}
