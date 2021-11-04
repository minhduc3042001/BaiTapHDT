package com.duchm2008110312.kiemtragiuaki;

public class nguoi {
    private String hoTen;
    private String diaChi;
    public nguoi(){
        System.out.println("quan li hoc vien...");
    }
    public nguoi(String hoTen, String diaChi){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public String getHoten() {
        return hoTen;
    }
 
    public void setHoten(String hoTen) {
        this.hoTen = hoTen;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
       this.diaChi = diaChi;
    }
    Override
    public String toString() {
        return "nguoi [Địa Chỉ="+ diaChi +", Họ Tên="+ hoTen +"]";
    }
}
