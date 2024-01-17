/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_3;

/**
 *
 * @author nguye
 */
public class svmatma extends sinhvien {
    private String donvi;
    private double luong;

    public svmatma(String masv, String ten, String ngaysinh, String gioitinh, double diem, String donvi, double luong) {
        super(masv, ten, ngaysinh, gioitinh, diem);
        this.donvi = donvi;
        this.luong = luong;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + donvi + "," + luong;
    }
    
}
