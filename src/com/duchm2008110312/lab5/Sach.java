package com.duchm2008110312.lab5;

public class Sach {
    String tenSach;
    String giaTien;
    String nhaSanXuat;
    int namXB;
    String soLuong;
    String loai;
    
    Sach(){
        nhaSanXuat = "Tommy Tèo";
    }
    Sach(int nXB){
        namXB =nXB;
    }
    Sach(String tS, String gT ){
        tenSach=tS;
        giaTien=gT;
    }
    Sach(String tS, String sL, String l){
        tenSach = tS;
        soLuong = sL;
        loai    = l;
    }
    void showThongTin() {
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tên nhà xuất bản: " + nhaSanXuat);
        System.out.println("Giá tiền: " + giaTien);

    }
}
