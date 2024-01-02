/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author nguye
 */
public class mainPS {
    public static void main (String[] args)
    {
        PS ps1 = new PS(1,2);
        PS ps2 = new PS(3,4);
        PS ketqua = PS.congps(ps1,ps2);
        System.out.print(ketqua.getTu()+"/"+ketqua.getMau());
    }
}
