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
public class tskC extends thisinh{
    private double van;
    private double su;
    private double dia;

    public tskC() {
    }

    
    public tskC(String ten, String ngaysinh, String diachi, double van, double su, double dia) {
        super(ten, ngaysinh, diachi);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return super.toString() + "," + van + "," + su + "," + dia;
    }
    public void nhap()
    {
                //super.nhap();
          Scanner input = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập diem van");
        van = input.nextDouble();
         System.out.println("Nhập diem su");
        su = input.nextDouble();
         System.out.println("Nhập diem dia");
        dia = input.nextDouble();
         input.nextLine();
    }
    public double tong()
    {
        return van+su+dia;
    }
}
