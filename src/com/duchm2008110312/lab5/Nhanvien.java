package com.duchm2008110312.lab5;

public class Nhanvien {
    String tenNhanVien;
    String tienLuong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;
NhanVien(){
    diaChi="679 - Gia Lai";
}
NhanVien(String bplv){
    boPhanLamViec=bplv;
}
NhanVien(String tnv, String ns){
    tenNhanVien=tnv;
    ngaySinh=ns;
}
NhanVien(String tnv, String tl, String bplv){
    tenNhanVien=tnv;
    tienLuong = tl;
    boPhanLamViec=bplv;
}

}
