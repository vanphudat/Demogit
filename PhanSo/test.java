package PhanSo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số");
        double tt = sc.nextDouble();
        System.out.println("Nhập mẫu số");
        double tm = sc.nextDouble();
        toanPS toan = new toanPS(tt,tm);
        System.out.println(toan.display());
    }
}
