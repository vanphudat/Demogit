package toanptb2;

public class phuongtrinhbac2 {
    private double a;
    private double b;
    private double c;

    public phuongtrinhbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return this.b*this.b-4*this.a*this.c;
    }
    public double getRoot(){
        return (-this.b/(2*this.a));
    }
    public double getRoot1(){
        return (-this.b + Math.pow(getDiscriminant(), 0.5))/2*this.a;
    }
    public double getRoot2(){
        return (-this.b - Math.pow(getDiscriminant(), 0.5))/2*this.a;
    }
}
