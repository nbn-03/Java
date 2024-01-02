/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class b_11 {
    public static boolean check(int n)
    {
        if(n < 2)
        {
            return false;
        }
        else 
        {
            int sum = 0;
            for (int i = 2; i<=sqrt(n); i++)
            {
                if (n%1==0)
                    sum = sum +1;
            }
            if(sum == 0)
                return true;
            else 
                return false;
        }
    }
    public static void main (String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        if(check(n) ==true)
            System.out.print("là số nguyên tố");
        else
            System.out.print("không là số nguyên tố");
    }
}
