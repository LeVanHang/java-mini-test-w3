package hotel;

import java.util.Scanner;

public class Hotel {
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private People nguoi;
    public Hotel() {
        super();
    }
    public Hotel(int soNgayTro, String loaiPhong, double giaPhong, People nguoi) {
        super();
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
    }

    public People getNguoi() {
        return nguoi;
    }
    public void setNguoi(People nguoi) {
        this.nguoi = nguoi;
    }
    public void nhapThongTinCanQuanLy() {
        Scanner scanner = new Scanner(System.in);

        // nhập thông tin khách trọ
        nguoi = new People();
        nguoi.nhapThongTinKhachTro();

        System.out.print("Nhập số ngày trọ: ");
        soNgayTro = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập loại phòng: ");
        loaiPhong = scanner.nextLine();
        System.out.print("Nhập giá phòng: ");
        giaPhong = scanner.nextDouble();
    }

    public void hienThiThongTinCanQuanLy() {
        nguoi.hienThiThongTinKhachTro();
        System.out.println("Số ngày trọ: " + soNgayTro);
        System.out.println("Loại phòng: " + loaiPhong);
        System.out.println("Giá phòng: " + giaPhong);
    }
    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}