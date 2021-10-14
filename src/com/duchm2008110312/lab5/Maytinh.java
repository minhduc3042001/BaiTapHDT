package com.duchm2008110312.lab5;

public class Maytinh {
    String tenNhaSanXuat;
        String namSanXuat;
        String heDieuHanh;
        String ram;
        String cpu;
        String gia;
        String namBaoHanh;
        MayTinh() {
            namBaoHanh = "2 năm";
        }
        MayTinh(String g) {
            gia = g;
        }
        MayTinh(String nsx, String n) {
            tenNhaSanXuat = nsx;
            namSanXuat = n;
        }
        MayTinh(String hdh, String c, String r) {
            heDieuHanh = hdh;
            cpu = c;
            ram = r;
        }  
}
