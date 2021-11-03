package com.duchm2008110312.Animal;

public class Dog  extends Animal{
    @Override protected void eat(){
        System.out.println("ăn kiểu chó...");
    }
    @Override protected void makeNoise(){
        System.out.println("sủa gâu gâu...");
    }
}
