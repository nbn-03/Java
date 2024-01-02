/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class danhsach {
    static ArrayList<student> ds = new ArrayList<>();
    public static int check(String searchName)
    {
        for(int i=0;i < ds.size();i++)
        {
            if(ds.get(i).getTen().equals(searchName))
            {
                  return i;
            }
        }
        return -1;
    }
    public static void edit(String searchName, int nam,String diachi, String gioitinh, String nganh, String khoahoc, int diem, String sothich)
    {
        int i = check(searchName);
        student s = ds.get(i);
        s.setNamsinh(nam);
        s.setDiachi(diachi);
        s.setGioitinh(gioitinh);
        s.setNganh(nganh);
        s.setKhoahoc(khoahoc);
        s.setDiemtb(diem);
        s.setSothich(sothich);
    }
}
