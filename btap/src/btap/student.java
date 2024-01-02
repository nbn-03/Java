/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btap;

/**
 *
 * @author nguye
 */
public class student {
    private String ten;
    private int namsinh;
    private String diachi;
    private String gioitinh;
    private String nganh;
    private String khoahoc;
    private int diemtb;
    private String sothich;

    public student(String ten, int namsinh, String diachi, String gioitinh, String nganh, String khoahoc, int diemtb, String sothich) {
        this.ten = ten;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.nganh = nganh;
        this.khoahoc = khoahoc;
        this.diemtb = diemtb;
        this.sothich = sothich;
    }

    public String getTen() {
        return ten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getNganh() {
        return nganh;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public int getDiemtb() {
        return diemtb;
    }

    public String getSothich() {
        return sothich;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    public void setDiemtb(int diemtb) {
        this.diemtb = diemtb;
    }

    public void setSothich(String sothich) {
        this.sothich = sothich;
    }

    @Override
    public String toString() {
        return ten + "," + namsinh + "," + diachi + "," + gioitinh + "," + nganh + "," + khoahoc + "," + diemtb + "," + sothich;
    }
    
}
