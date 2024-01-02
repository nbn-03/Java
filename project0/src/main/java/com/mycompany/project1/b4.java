/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author nguye
 */
public class b4 {
    public static void giaiPhuongTrinhBac2(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        double x1, x2;
        
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep:");
            System.out.println("x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }

    public static void main(String[] args) {
        double a = 2; // Coefficient of x^2
        double b = 4; // Coefficient of x
        double c = -10; // Constant term

        giaiPhuongTrinhBac2(a, b, c);
    }
}
