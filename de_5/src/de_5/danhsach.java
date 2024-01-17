/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class danhsach {
    ArrayList<thisinh> ds = new ArrayList<>();
    public void taods()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i < n;i++)
        {
            System.out.println("nhap a hoac c");
            String t = scanner.nextLine();
            if(t.compareTo("a")==0)
            {
                thisinh ts = new tskA();
                ts.nhap();
                ds.add(ts);
            }
            else if(t.compareTo("c")==0)
            {
                thisinh ts = new tskC();
                ts.nhap();
                ds.add(ts);
            }
        }
        for(int i =0; i<ds.size();i++)
        {
            if(ds.get(i) instanceof tskA)
            {
                tskA a = (tskA) ds.get(i);
                if(a.tong()>20)
                {
                    System.out.println(a.toString());
                }
            }
            if(ds.get(i) instanceof tskC)
            {
                tskC c = (tskC) ds.get(i);
                if(c.tong()>20)
                {
                    System.out.println(c.toString());
                }
            }
        }
    }
}
