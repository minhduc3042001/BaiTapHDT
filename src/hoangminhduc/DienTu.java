package hoangminhduc;

public class DienTu extends HangHoa {
    static int count = 0; 

    DienTu() {
    }

    DienTu(int maHangHoa, String loaiHangHoa, String tenHangHoa, int giaNhap, String ngayNhapKho,
            int soLuongTonKho) {
        super(maHangHoa, loaiHangHoa, tenHangHoa, giaNhap, ngayNhapKho, soLuongTonKho);
        count++;
    }

}