package com.duchm2008110312.kiemtragiuaki;

public class NhanVien extends nguoi{
    private float heSoLuong;
    protected void setHeSoLuong(float a){
        if(1 <= a)
            heSoLuong = a;
        else 
            System.out.println("Hệ số lương ko hợp lệ");
    }
    protected float getHeSoLuong(){
        return heSoLuong;
    }
    protected float tinhLuong(){
        float luong;
        luong = heSoLuong * 1500000;
        return luong;
    }
    @Override
    public String toString() {
        String s;
        s = "\n"+"Tên: "+getHoTen()+" Địa chỉ: "+getDiaChi()+" Hệ số lương: "+getHeSoLuong()+" Lương: "+tinhLuong();
        return s;
    }
}
