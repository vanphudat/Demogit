package QuanLyDiem;

public class KhoaAnh extends NamHoc2023{
    public KhoaAnh(String ten, String cccd) {
        super(ten, cccd);
    }
    //override

    @Override
    public void tinhDTB() {
        System.out.println("Đây là phương thức tính điểm trung bình của khoa anh");
    }
}
