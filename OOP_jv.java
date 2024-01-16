import TruongDH.SinhVien;

public class OOP_jv {
    public static void main(String[] args) {
        //Khởi tạo đối tượng thuộc class sinh viên
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Tèo");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Tí",9.5);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        //Thay đổi tên sv4
        sv4.setHoTen("Đen");
        sv4.setDiem(25);
        sv4.hienThiThongTin();
        //Test kiểu phương thức có kiểu trả về
        double dtbsv4 = sv4.tinhDTB(1.5,7.2);
        System.out.println(dtbsv4);
        //Test phương thức totring
        System.out.println(sv4);

        //suppport method và service method
        sv4.checkHopLeDiem();
        //overloading
        double testD = sv4.tinhDTB(5,6,7);
        System.out.println(testD);
        double testD2 = sv4.tinhDTB(8,9);
        System.out.println(testD2);
        double kq = sv4.tongDiem(1,5.5,4.6,1,4,10);
        System.out.println(kq);
    }
}
