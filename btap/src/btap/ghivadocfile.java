/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nguye
 */
public class ghivadocfile {
    public static void ghifile() throws IOException {
    File f = new File("C:\\java-2022-09\\test.txt");
        try (FileWriter fw = new FileWriter(f); BufferedWriter bw = new BufferedWriter(fw)) {
            
            for (int i = 0; i < danhsach.ds.size(); i++) {
                student s = danhsach.ds.get(i);
                bw.write(s.toString());
                bw.newLine(); // Thêm dòng mới cho mỗi đối tượng
            }
            bw.close();
            fw.close();
        }
}
    public static void docfile() throws IOException
    {
        File f = new File("C:\\java-2022-09\\test.txt");
        try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
            String str;
            while((str = br.readLine())!=null)
            {
                String [] info = str.split(",");
                String ten = info[0];
                int namsinh = Integer.parseInt(info[1]);
                String diachi = info[2];
                String gioitinh = info[3];
                String nganh = info[4];
                String khoahoc = info[5];
                int diemtb = Integer.parseInt(info[6]);
                String sothich = info[7];
                student s = new student(ten,namsinh,diachi,gioitinh,nganh,khoahoc,diemtb,sothich);
                danhsach.ds.add(s);
            }
            br.close();
            fr.close();
        }
    }
}
