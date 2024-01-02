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
public class b_10 {
    public static void main (String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int sum = 0;
        while(n> 0)
        {
            sum = sum + n%10;
            n = n /10;
        }
        System.out.print(sum);
    }
}
