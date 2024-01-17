/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_3;

/**
 *
 * @author nguye
 */
public class svattt extends sinhvien {
    private double hocphi;

    public svattt(double hocphi) {
        this.hocphi = hocphi;
    }

    public svattt(String masv, String ten, String ngaysinh, String gioitinh, double diem, double hocphi) {
        super(masv, ten, ngaysinh, gioitinh, diem);
        this.hocphi = hocphi;
    }

    public double getHocphi() {
        return hocphi;
    }

    public void setHocphi(double hocphi) {
        this.hocphi = hocphi;
    }

    @Override
    public String toString() {
        return super.toString() + hocphi;
    }
    
    
}
