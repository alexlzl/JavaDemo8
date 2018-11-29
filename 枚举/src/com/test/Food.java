package com.test;

import java.util.PrimitiveIterator;

public interface Food {
       String name="alex";
    enum Coffee implements Food{
        BLACK_COFFEE,DECAF_COFFEE,LATTE,CAPPUCCINO
    }
    enum Dessert implements Food{
        FRUIT, CAKE, GELATO
    }

    public class T{}

    static void test(){

    }

    default void test1(){

    }

}
