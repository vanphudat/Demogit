package toanptb2;

import java.util.Scanner;

public class test_ptb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các tham số");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        phuongtrinhbac2 pt = new phuongtrinhbac2(a,b,c);
        if (pt.getDiscriminant() > 0) {
            System.out.println("The roots are " + pt.getRoot1() + " and " + pt.getRoot2());
        } else if (pt.getDiscriminant() == 0) {
            System.out.println("The roots are " + pt.getRoot());
        }else{
            System.out.println("The equation has no real roots");
        }
    }

}
