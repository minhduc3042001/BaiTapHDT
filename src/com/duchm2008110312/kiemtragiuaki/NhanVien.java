package com.duchm2008110312.kiemtragiuaki;

public class NhanVien extends nguoi{
    String ten,luong;
       float luongcuanhanvien;
       final String dong=("---------------------");
       System.out.println("luong cua nhan vien");
       System.out.println(dong);
       Scanner nhap=new Scanner(System.in);
       System.out.println("nhap ho ten nhan vien:");
       ten = nhap.nextLine();
       System.out.println("nhap luong cua nhan vien:");
       luong = nhap.nextFloat();
}
