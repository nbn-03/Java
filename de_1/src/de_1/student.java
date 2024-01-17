/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_1;

/**
 *
 * @author nguye
 */
public class student extends person {
    private String masv;
    private double diem;
    public student(String ten, String ngaysinh, String diachi, String gioitinh, String masv, double diem) {
        super(ten, ngaysinh, diachi, gioitinh);
        this.masv = masv;
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return super.toString() + "," + masv + "," + diem;
    }
    
}
