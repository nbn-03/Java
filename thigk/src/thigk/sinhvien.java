/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thigk;

/**
 *
 * @author nguye
 */
public class sinhvien {
    private String tensv;
    private String ngaySinh;
    private String gioiTinh;
    private double diemTrungBinh;

    public sinhvien(String tensv, String ngaySinh, String gioiTinh, double diemTrungBinh) {
        this.tensv = tensv;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return tensv + "," + ngaySinh + "," + gioiTinh + "," + diemTrungBinh;
    }
    
}
    