package HinhChuNhat;

import java.awt.*;
import java.util.Scanner;

public class testHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao hình chữ nhật");
        double cc = sc.nextDouble();
        System.out.println("Nhập chiều rộng hình chữ nhật");
        double cr = sc.nextDouble();
        hinhChuNhat rectangle = new hinhChuNhat(cc, cr);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.tinhDT());
        System.out.println("Area of the Rectangle: "+ rectangle.tinhDT1());
    }
}
