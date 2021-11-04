package com.duchm2008110312.kiemtragiuaki;

import java.util.Scanner;

public class KhachHang extends nguoi{
String ten,hoadon;
    double giatriHoaDon;
    final String dong="---------------------------------------------";
    System.out.println("ten cong ty");
    System.out.println(dong);
    Scanner nhap=new Scanner(System.in);
    System.out.println("nhap ten cong ty");
    ten = nhap.nextFloat();
    System.out.println("gia tri hoa don");
    giatriHoaDon = nhap.nextFloat();
}
