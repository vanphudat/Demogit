package QuanLyDiem;

public class KhoaToan extends NamHoc2023{
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }
    //override

    @Override
    public void tinhDTB() {
        System.out.println("Đây là phương thức tính điểm trung bình của khoa toán");
    }
}
