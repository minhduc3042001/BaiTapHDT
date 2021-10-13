package com.duchm2008110312.lab5;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach book = new Sach(); 
        System.out.println("Tên nhà xuất bản: " + book.nhaSanXuat);
        System.out.println();
        
        Sach book0 = new Sach(1975); 
        System.out.println("Xuất bản lần đầu: " + book0.namXB);
        System.out.println();

        Sach book1 = new Sach("Một Điếu", "79.000 VNĐ"); 
        System.out.println("Tên Sách: " + book1.tenSach);
        System.out.println("Giá tiền: " + book1.giaTien);
        System.out.println();

        Sach book2 = new Sach("Một Điếu", "1 cuốn", "Nghệ Thuật Ảo Ma"); 
        System.out.println("Tên sách: " + book2.tenSach);
        System.out.println("Số lượng: " + book2.soLuong);
        System.out.println("Thể loại: " + book2.loai);
        System.out.println();

    }
}
