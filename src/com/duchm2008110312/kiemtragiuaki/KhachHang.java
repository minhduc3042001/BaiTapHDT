package com.duchm2008110312.kiemtragiuaki;

import java.util.Scanner;

public class KhachHang extends nguoi{
    private String tenCongTy;
    private double triGiaHoaDon;
    protected void setTenCongTy(String tenCongTy){
        this.tenCongTy = tenCongTy;
    }
    protected String getTenCongTy(){
        return tenCongTy;
    }
    protected void  setTriGiaHoaDon(double a){
        if(0 <= a)
            triGiaHoaDon = a;
        else
            System.out.println("Trị giá hóa đơn ko hợp lệ");
    }
    protected double getTriGiaHoaDon(){
        return triGiaHoaDon;
    }
    @Override
    public String toString() {
        String s;
        s = "Tên công ty: "+getTenCongTy()+" Trị giá hóa đơn: "+getTriGiaHoaDon();
        return s;
    }
}
