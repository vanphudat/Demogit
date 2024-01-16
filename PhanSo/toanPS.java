package PhanSo;

public class toanPS {
    private double tuSo;
    private double mauSo;

    public toanPS(double tt, double tm) {
        this.tuSo = tt;
        this.mauSo = tm;
    }

    public double getTuSo() {
        return tuSo;
    }

    public double getMauSo() {
        return mauSo;
    }

    public String display() {
        return tuSo + "/" +mauSo;
    }
}
