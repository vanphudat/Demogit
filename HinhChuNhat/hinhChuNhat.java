package HinhChuNhat;

public class hinhChuNhat {
    private double chieuRong;
    private double chieuCao;

    public hinhChuNhat(double chieuRong, double chieuCao) {
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    @Override
    public String toString() {
        return "hinhChuNhat{" +
                "chieuRong=" + chieuRong +
                ", chieuCao=" + chieuCao +
                '}';
    }
    public String display() {
        return "Rectangle{" + "width=" + chieuRong + ", height=" + chieuCao + "}";
    }
    public double tinhDT(){
        return chieuCao*chieuRong;
    }
    public double tinhDT1(){
        return (chieuCao+chieuRong)*2;
    }
}
