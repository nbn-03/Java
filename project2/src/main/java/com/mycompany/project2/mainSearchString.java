/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author nguye
 */
public class mainSearchString {
    public static void main(String[] args)
    {
        String s1 = "hellonbnantoan";
        String s2 = "nbn";
        SearchString tk = new SearchString();
        if(tk.search(s1, s2) == -1) {
            System.out.print("ngu");
        } else 
            System.out.print(tk.search(s1, s2));
    }
}
