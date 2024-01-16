package Congty;

public class test {
    public static void main(String[] args) {
        /*NhanVien nv1 = new NhanVien("Nhân viên 1","Bắc Ninh",123456);
        double luongnv1 = nv1.tinhLuong();
        System.out.println("Lương của nhân viên nv1 là: "+luongnv1);*/
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hành chính 1","Thái Nguyên",333);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("Lương của nhân viên hc1 là: "+luonghc1);
        NhanVienDiCa ca1 = new NhanVienDiCa("ca1","Hà Nội",5555);
        double ca1luong = ca1.tinhLuong();
        System.out.println("Lương của nhân viên đi ca là: "+ca1luong);
        NhanVienDiCa ca2 = new NhanVienDiCa("Tí","Từ Sơn",555123,1);
        double ca2luong = ca2.tinhLuong();
        System.out.println("Lương của nhân viên đi ca 2 là: "+ca2luong);
        System.out.println(ca1.ca);

    }
}
