package com.duchm2008110312.lab5;

public class MaytinhTestDrive {
    public static void main(String[] args) {
        MayTinh mt = new MayTinh();
        System.out.println("Năm bảo hành: " + mt.namBaoHanh);
        System.out.println();

        MayTinh mt1 = new MayTinh("17.000.000 VNĐ");
        System.out.println("Giá tiền: " + mt1.gia);
        System.out.println();

        MayTinh mt2 = new MayTinh("Dell", "2021");
        System.out.println("Nhà sản xuất: " + mt2.tenNhaSanXuat);
        System.out.println("Năm sản xuất: " + mt2.namSanXuat);
        System.out.println();

        MayTinh mt3 = new MayTinh("Window 10", "Intel Core i5-3210M", "4 GB, 2500MHz");
        System.out.println("Hệ điều hành: " + mt3.heDieuHanh);
        System.out.println("CPU: " + mt3.cpu);
        System.out.println("RAM: " + mt3.ram);
        System.out.println();
    }  
    
}
