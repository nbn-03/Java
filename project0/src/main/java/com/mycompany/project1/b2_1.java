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
public class b2_1 {
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int sum = 0;
        int n = k.nextInt();
        for(int i =0; i<n; i++)
        {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
