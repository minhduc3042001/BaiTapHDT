package com.duchm2008110312.Animal;

public class Animal {
    protected String sound;
    protected String fool;
    protected String picture;
    protected int hungri;
    public Animal(){
        System.out.println("making a Animal ...");
    }

    public Animal(String n){
        name = n;
    }

    protected void makeNoise(){
      
        System.out.println("Hmm...");
    }

    protected void eat(){
        System.out.println("Ăn ...");
    }


    protected void sleep(){
        System.out.println("Ngủ ...");
    }

    protected void roam(){
        System.out.println("Đi lang thang...");
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   }
}
