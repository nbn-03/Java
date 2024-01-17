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
public class tskA extends thisinh{
    private double toan;
    private double ly;
    private double hoa;

    public tskA() {
    }

    public tskA(String ten, String ngaysinh, String diachi,double toan, double ly, double hoa) {
        super(ten, ngaysinh, diachi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + toan + "," + ly + "," + hoa ;
    }
    public double tinhdiem(){
        return toan +ly+hoa;
    }
    public void nhap()
    {
        //super.nhap();
        Scanner input = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập diem toan");
        toan = input.nextDouble();
         System.out.println("Nhập diem ly");
        ly = input.nextDouble();
         System.out.println("Nhập diem hoa");
        hoa = input.nextDouble();
        input.nextLine();
    }
    public double tong()
    {
        return toan+ly+hoa;
    }
}
