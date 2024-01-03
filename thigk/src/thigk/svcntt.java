/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thigk;

/**
 *
 * @author nguye
 */
public class svcntt extends sinhvien {
    private double hocPhi;

    // Phương thức khởi tạo cho lớp SinhVienCNTT
    public svcntt(String maSv, String ngaySinh, String gioiTinh, double diemTrungBinh, double hocPhi) {
        // Gọi phương thức khởi tạo của lớp cha (SinhVien)
        super(maSv, ngaySinh, gioiTinh, diemTrungBinh);
        this.hocPhi = hocPhi;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + hocPhi;
    }
    
}
