package com.duchm2008110312.Animal;

public class Cat extends Animal{
    @Override
    protected void makeNoise() {
        System.out.println("meo meo...");
    }

    @Override
    protected void eat() {
        System.out.println("nhăm nhăm...");
    }
}
