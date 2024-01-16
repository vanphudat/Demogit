package Enum;

import java.util.ArrayList;

public class testenum {
    public static void main(String[] args) {
        //Ktr thứ tự các giá trị trong enum
        System.out.println(xeploai.kha.ordinal());
        System.out.println(xeploai.yeu.ordinal());
        //tạo list danh sách
        ArrayList<SV> ds = new ArrayList<>();
        //Tạo đối tượng sinh viên
        SV sv1 = new SV(1,"Nguyễn Văn Một",9.5);
        SV sv2 = new SV(2,"Nguyễn Văn Hai",4.5);
        SV sv3 = new SV(3,"Nguyễn Văn Ba",7.5);
        //add sinh viên vào danh sách
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        //duyệt sinh viên
        for (SV ttSinhVien: ds){
            System.out.println(ttSinhVien);
        }
    }
}
