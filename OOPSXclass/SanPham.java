package OOPSXclass;

public class SanPham implements Comparable<SanPham>{
    //Thuộc tính
    private int ma;
    private String ten;
    private double gia;
    //Constructor

    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
    //get,set


    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }
    //ToString

    @Override
    public String toString() {
        return ma+"\t"+ten+"\t"+gia;
    }

    //Phương thức
    //Sắp xếp theo giá
    /*@Override
    public int compareTo(SanPham o) {
        if (this.gia<o.gia)
            return -1;
        if (this.gia>o.gia)
            return 1;
        return 0;
    }*/
    //Sắp xếp theo tên

    @Override
    public int compareTo(SanPham o) {
        return this.ten.compareToIgnoreCase(o.ten);
    }
}
