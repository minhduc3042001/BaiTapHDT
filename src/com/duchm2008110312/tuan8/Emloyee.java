package com.duchm2008110312.tuan8;

public class Emloyee extends Person{
    protected int salary;
    public String toString(){
        String s;
        s = name + "," + birthday;
        s += "," + salary;
        return s;
    }
    
}
