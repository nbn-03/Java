/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_2;

/**
 *
 * @author nguye
 */
public class nhanvien extends person {
    private String phongban;
    private double hsl;
    private double luong_cb;

    public nhanvien(String hoten, String ngaysinh, String diachi, String gioitinh, String phongban, double hsl, double luong_cb) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hsl = hsl;
        this.luong_cb = luong_cb;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public double getLuong_cb() {
        return luong_cb;
    }

    public void setLuong_cb(double luong_cb) {
        this.luong_cb = luong_cb;
    }
    public double lt()
    {
        return luong_cb * hsl;
    }

    @Override
    public String toString() {
        return super.toString() + phongban + "," + hsl + "," + luong_cb;
    }
    
}