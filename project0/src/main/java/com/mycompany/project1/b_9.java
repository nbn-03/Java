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
public class b_9 {
    public static int fabonaci1(int n)
    {
        if (n == 0)
            return 1;
        if (n==1)
            return 1;
        else
            return fabonaci1(n-1)+fabonaci1(n-2);
    }
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        System.out.print(fabonaci1(n));
    }
}
