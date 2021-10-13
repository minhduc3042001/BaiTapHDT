package com.duchm2008110312.lab5;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe a = new Xe("Yamaha"); 
        System.out.println("Hãng Sản Xuất: " + a.hangSanXuat);
        System.out.println();

        Xe b = new Xe("Ronaldo", "Exciter"); 
        System.out.println("Tên Chủ Xe: " + b.tenChuXe);
        System.out.println("Tên xe: " + b.dongXe);
        System.out.println();

        Xe c = new Xe("Việt Nam", "Moto", "Có giấy"); 
        System.out.println("Xuất Xứ: " + c.xuatXu);
        System.out.println("Dòng Xe: " + c.dongXe);
        System.out.println("Giấy Phép: " + c.giayPhep);
        System.out.println();
}
    
}
