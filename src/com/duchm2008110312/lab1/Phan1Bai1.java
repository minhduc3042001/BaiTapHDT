package com.duchm2008110312.lab1;
import java.util.Scanner;
public class Phan1Bai1 {
    public static void main(String[] args) {
        Scanner dieuKhien;
        dieuKhien = new Scanner(System.in);
        System.out.println("Họ Và Tên: ");
        String hoTen = dieuKhien.nextLine();
        System.out.println("Điểm Trung Binh: ");
        double diemTB = dieuKhien.nextDouble();
        System.out.printf("%s %.2f", hoTen , diemTB);
        dieuKhien.close();
    }
    }
    