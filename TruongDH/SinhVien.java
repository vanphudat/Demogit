package TruongDH;

public class SinhVien {
    //Thuộc tính
    private String hoTen;
    private double diem;
    //Constructor mặc định
    //Khởi tạo các giá trị mặc định
    //ngay khi giá trị vừa tạo ra
    public SinhVien(){
        hoTen="No name";
        diem=0.0;
    }

    //Constructor có đối số
    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    //Phương thức (các hàm)
    //Phương thức không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen+" : "+diem);
    }
    //Phương thức có kiểu trả về
    public double tinhDTB(double diemToan,double diemVan){
        return (diemToan+diemVan)/2;
    }
    public double tinhDTB(double diemToan,double diemVan, double diemAnh){
        return (diemToan+diemVan+diemAnh)/3;
    }
    public double tinhDTB(double diemToan,double diemVan, String abc){
        return (diemToan+diemVan)/2;
    }
    public double tinhDTB( String abc,double diemToan,double diemVan){
        return (diemToan+diemVan)/2;
    }
    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }
    //get,set
    public String getHoTen(){
        return hoTen;
    }
    public double getDiem(){
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    //suppport method và service method
    //suppport method
    //ktr điểm khi nhập hồ sơ cho sinh viên
    private boolean checkDiem(){
        return this.diem>=24;
    }
    //service method có thể gọi từ chương trình chính
    public void checkHopLeDiem(){
        if (checkDiem())
            System.out.println("Điểm hợp lệ, tiếp tục nhập thông tin");
        else
            System.out.println("Kiểm tra lại điểm đầu vào của sinh viên");
    }
    //parametter list
    public double tongDiem(double ... arr){
        double tong = 0.0;
        for (double x:arr){
            tong+=x;
        }
        return tong;
    }
}