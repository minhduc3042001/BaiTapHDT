package com.duchm2008110312.lab5;

public class TaiKhoan {
    String soDu;
    String soTaiKhoan;
    String tenTaiKhoan;
    String tenNganHang;
    String diaChi;
    String namSinh;
    String ngayCapThe;
    TaiKhoan() {
        tenNganHang = "Agribank";
    }
    TaiKhoan(String ten) {
        tenTaiKhoan = ten;
    }
    TaiKhoan(String nS, String dc) {
        namSinh = nS;
        diaChi = dc;
    }
    TaiKhoan(String stk, String sD, String ngayCap) {
        soTaiKhoan = stk;
        soDu = sD;
        ngayCapThe = ngayCap;
    }
}
