package com.duchm2008110312.Animal;

public class Lion extends Animal{
    @Override protected void makeNoise(){
        System.out.println("gầm dú...");
    }
    @Override
    protected void eat() {
        System.out.println("cắn xé...");
    }
}
