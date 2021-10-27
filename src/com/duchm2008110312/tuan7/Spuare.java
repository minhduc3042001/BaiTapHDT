package com.duchm2008110312.tuan7;

public class Spuare {
    boolean nhapChuot;
    String amThanh;
    public static int soLanNhapChuot;
    Void xoay(){
        System.out.println("Xoay 360 theo chiều kim đồng hồ");
    }
    Void phatAmThanh(){
        System.out.println("Ting Ting");
    }
    Square(boolean n, String s){
        nhapChuot = n;
        amThanh = s;
        soLanNhapChuot++;
    }
}
