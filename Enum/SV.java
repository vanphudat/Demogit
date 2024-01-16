package Enum;

public class SV {
    //thuộc tính
    private int ma;
    private String ten;
    private double dtb;
    private xeploai loai;
    //constructor

    public SV(int ma, String ten, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.dtb = dtb;
        this.loai=getLoai();
    }
    //Phương thức để get loại
    public xeploai getLoai(){
        if (this.dtb>=8)
            loai=xeploai.gioi;
        else if (this.dtb>=6.5)
            loai=xeploai.kha;
        else if (this.dtb>=5.0)
            loai=xeploai.tb;
        else if (this.dtb>=3.0)
            loai=xeploai.yeu;
        else
            loai=xeploai.duoihoc;
        return loai;
    }
    //ToString

    @Override
    public String toString() {
        return ma+"\t"+ten+"\t"+this.loai;
    }
}
