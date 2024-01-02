/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class b_12 {
    public static int[] nhapmang(int a[], int n)
    {
        Scanner k = new Scanner(System.in);
        for (int i =0; i<n;i++)
        {
            a[i] = k.nextInt();
        }
        return a;
    }
    public static void inmang(int a[], int n)
    {
        for(int i =0; i<n;i++)
        {
            System.out.print(a[i]);
        }
        System.out.printf("\n");
    }
    public static int timmax(int a[], int n)
    {
        int m = a[0];
        for(int i=1; i<n;i++)
        {
            if(m<a[i])
                m = a[i];
        }
        return m;
    }
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int [] a = new int [n];
        a = nhapmang(a, n);
        inmang(a,n);
        System.out.print(timmax(a,n));
    }
}
    