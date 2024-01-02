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
public class b_13 {
    public static int[][] nhapMaTran(int[][] matrix, int n, int m) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhập phần tử thứ [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void inMaTran(int[][] matrix, int n, int m) {
        System.out.println("Ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số hàng của ma trận: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        matrix = nhapMaTran(matrix, n, m);
        inMaTran(matrix,n,m);
    }
}
