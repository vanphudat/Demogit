package Congty;

public class NhanVienDiCa extends NhanVien{
    //khai báo thêm thuộc tính ca
    //ca 1: làm ngày
    //ca 2: làm đêm
    protected int ca;
    public NhanVienDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }
    public NhanVienDiCa(String ten, String que, int cccd,int ca) {
        super(ten, que, cccd);
        this.ca=ca;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan+1.05; // cao hơn 5% so với nhân viên hành chính
    }
}
