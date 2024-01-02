/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class MyDate {
    private int date;
    private int month;
    private int year;
    MyDate()
    {
        date = 1;
        month =1;
        year = 1;
    }
    MyDate(int date, int month, int year)
    {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public void nhap()
    {
        Scanner k = new Scanner(System.in);
        date = k.nextInt();
        month = k.nextInt();
        year = k .nextInt();
    }
    public void in()
    {
        System.out.print(date+"-"+month+"-"+year);
    }
}
