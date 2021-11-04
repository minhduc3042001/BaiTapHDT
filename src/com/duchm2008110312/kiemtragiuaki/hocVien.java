package com.duchm2008110312.kiemtragiuaki;

public class hocVien extends nguoi{
    String ten,diem;
        float diemMonHoc1,diemMonHoc2,diemtrungbinh2mon;
        final String dong="-----------------------------------------------------";
        System.out.println("diem cua hoc vien");
        System.out.println(dong);
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap ho ten hoc vien: ");
        ten = nhap.nextLine();
        System.out.println("Diem Mon Hoc 1: ");
        diemMonHoc1 = nhap.nextFloat();
        System.out.println("Diem Mon Hoc 2: ");
        diemMonHoc2 = nhap.nextFloat();
        System.out.println("Diem trung binh:");
        diemtrungbinh2mon = (diemMonHoc1+diemMonHoc2)/2;
}
