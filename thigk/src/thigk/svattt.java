/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thigk;

/**
 *
 * @author nguye
 */
public class svattt extends sinhvien {
     private String donVi;
    private double luong;

    // Phương thức khởi tạo cho lớp SinhVienATTT
    public svattt(String maSv, String ngaySinh, String gioiTinh, double diemTrungBinh, String donVi, double luong) {
        // Gọi phương thức khởi tạo của lớp cha (SinhVien)
        super(maSv, ngaySinh, gioiTinh, diemTrungBinh);
        this.donVi = donVi;
        this.luong = luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + donVi + "," + luong;
    }
    
}
