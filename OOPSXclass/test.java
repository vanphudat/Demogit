package OOPSXclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        //Tạo list
        ArrayList<SanPham> ds = new ArrayList<>();
        //Khởi tạo các đối tượng sản phẩm
        SanPham sp1 = new SanPham(1,"SamSung",1050);
        SanPham sp2 = new SanPham(2,"IPhone",500);
        SanPham sp3 = new SanPham(3,"DaoCamHo",800);
        //Add sản phẩm vào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        //Xem ds sản phẩm trong list
        for (SanPham sp:ds){
            System.out.println(sp);
        }
        //Gọi phương thức sắp xếp
        Collections.sort(ds);
        System.out.println("Danh sách sau sắp xếp là:");
        for (SanPham sp:ds){
            System.out.println(sp);
        }
    }
}
