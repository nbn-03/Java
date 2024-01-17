/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nguye
 */
public class docfile {
    public static void doc_file() throws FileNotFoundException, IOException
    {
        File f = new File("C:\\Users\\nguye\\OneDrive\\Desktop\\d2.txt");
        FileReader fd = new FileReader(f);
        BufferedReader br = new BufferedReader(fd);
        String sr;
        while((sr = br.readLine())!=null)
        {
            //System.out.println(sr);
            String [] info = sr.split("\\$"); //vì $ là kí hiệu đặc biệt nên có \\ trước nó
            String ten = info[0];
            String ns = info[1];
            String dc = info[2];
            String gt = info[3];
            String pb = info[4];
            double hsl = Double.parseDouble(info[5]);
            double lcb = Double.parseDouble(info[6]);
            nhanvien nv = new nhanvien(ten,ns,dc,gt,pb,hsl,lcb);
            dsnv.ds.add(nv);
        }
        br.close();
        fd.close();
    }
}
