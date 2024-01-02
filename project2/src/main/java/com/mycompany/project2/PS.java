/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author nguye
 */
public class PS {
    private int tu;
    private int mau;
    PS(int tu, int mau)
    {
        this.tu = tu;
        this.mau = mau;
    }
    PS(int tu)
    {
        this.tu = tu;
        mau = 1;
    }
    public static PS congps(PS ps1, PS ps2)
    {
        int tongtu = ps1.tu*ps2.mau + ps1.mau*ps2.tu;
        int tongmau = ps1.mau * ps2.mau;
        return new PS(tongtu, tongmau);
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }
    
}
