package com.duchm2008110312.lab4;

public class AccountTestDrive {
    public static void main(String[] args) 
    {
        Account account;
        account = new Account(200,600);
        account.showData();
        account.napTien(300);
        account.showData();
        account.rutTien(200);
        account.showData();
        Customer customer1 = new Customer("Hoàng Minh Đức",2001,"Nam");
        customer1.getName();
        System.out.println();
        Address address = new Address(234, "Gia Lai","Việt Nam");
        address.showAddress();
        
    }
}    
 