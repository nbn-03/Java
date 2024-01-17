/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_5;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class thisinh {
    private String ten;
    private String ngaysinh;
    private String diachi;

    public thisinh() {
    }

    public thisinh(String ten, String ngaysinh, String diachi) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return ten + "," + ngaysinh + "," + diachi;
    }
    public void nhap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập họ tên");
        ten = input.nextLine();
        System.out.println("Nhập ngày sinh");
        ngaysinh = input.nextLine();
        System.out.println("Nhập dia chi");
        diachi = input.nextLine();
    }
    
}
