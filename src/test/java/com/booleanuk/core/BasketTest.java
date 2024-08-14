package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddBagel(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.addBagel("Sesame"));
        Assertions.assertTrue(basket.addBagel("Oat"));
        Assertions.assertFalse(basket.addBagel("Totally not a bagel"));
    }

    @Test
    public void testRemoveBagel(){
        Basket basket = new Basket();
        basket.addBagel("Sesame");
        basket.addBagel("Oat");
        Assertions.assertTrue(basket.removeBagel("Sesame"));
        Assertions.assertTrue(basket.removeBagel("Oat"));
    }

    @Test
    public void testGetBasketSize(){
        Basket basket = new Basket();
        basket.basketSize = 3;
        Assertions.assertEquals(3, basket.getBasketSize());
    }

    @Test
    public void testSetBasketSize(){
        Basket basket = new Basket();
        // basket.setBasketSize(3);
        Assertions.assertTrue(basket.setBasketSize(3));
        Assertions.assertEquals(3, basket.getBasketSize());
    }

    @Test
    public void testFullBasket(){
        Basket basket = new Basket();
        basket.setBasketSize(1);
        Assertions.assertTrue(basket.addBagel("Sesame"));
        Assertions.assertFalse(basket.addBagel("Oat"));
    }

    @Test
    public void testRemoveBagelInvalid(){
        Basket basket = new Basket();
        basket.addBagel("Sesame");
        Assertions.assertFalse(basket.removeBagel("Oat"));
    }


}
