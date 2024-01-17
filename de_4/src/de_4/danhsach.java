/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_4;

import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class danhsach {
    static ArrayList<word> ds = new ArrayList<>();
    public static void nhap()
    {
        word w1 = new word(1,"xin chao","hello");
        word w2 = new word(2,"tam biet","bye");
        word w3 = new word(3,"1","one");
        word w4 = new word(4,"2","two");
        word w5 = new word(5,"3","three");
        word w6 = new word(6,"5","five");
        word w7 = new word(7,"6","six");
        word w8 = new word(8,"7","seven");
        word w9 = new word(9,"10","ten");
        word w10 = new word(10,"8","eight");
        ds.add(w1);
        ds.add(w2);
        ds.add(w3);
        ds.add(w4);
        ds.add(w5);
        ds.add(w6);
        ds.add(w7);
        ds.add(w8);
        ds.add(w9);
        ds.add(w10);
    }
}
