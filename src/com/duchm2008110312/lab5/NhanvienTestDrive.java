package com.duchm2008110312.lab5;

public class NhanvienTestDrive {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien(); 
        System.out.println("Địa điểm kinh doanh: " + nv1.diaChi);
        System.out.println();
        
        NhanVien nv2 = new NhanVien("Phục Vụ"); 
        System.out.println("Bộ phận làm việc: " + nv2.boPhanLamViec);
        System.out.println();

        NhanVien nv3 = new NhanVien("Uncle Phục", "Pha Chế", "12.000.000"); 
        System.out.println("Tên Nhân Viên: " + nv3.tenNhanVien);
        System.out.println("Bộ Phận Làm Việc: " + nv3.boPhanLamViec);
        System.out.println("Lương: " + nv3.tienLuong);
        System.out.println();

}
}
