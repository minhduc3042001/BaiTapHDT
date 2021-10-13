package com.duchm2008110312.lab5;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan();
        System.out.println("Tên ngân hàng: " + tk.tenNganHang);
        System.out.println();

        TaiKhoan tk1 = new TaiKhoan("Leonel Messi");
        System.out.println("Tên khách hàng: " + tk1.tenTaiKhoan);
        System.out.println();

        TaiKhoan tk2 = new TaiKhoan("30/04/2001", "77/135 - Gia Lai");
        System.out.println("Ngày Sinh: " + tk2.namSinh);
        System.out.println("Địa chỉ: " + tk2.diaChi);
        System.out.println();

        TaiKhoan tk3 = new TaiKhoan("5023105808", "2.000 VNĐ", "07/12/2019");
        System.out.println("Số tài khoản: " + tk3.soTaiKhoan);
        System.out.println("Số dư: " + tk3.soDu);
        System.out.println("Ngày cấp thẻ: " + tk3.ngayCapThe);
        System.out.println();
}
