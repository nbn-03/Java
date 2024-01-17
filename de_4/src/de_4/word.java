/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_4;

/**
 *
 * @author nguye
 */
public class word {
    private int id;
    private String vn;
    private String eng;

    public word() {
    }

    public word(int id, String vn, String eng) {
        this.id = id;
        this.vn = vn;
        this.eng = eng;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    @Override
    public String toString() {
        return id + "," + vn + "," + eng;
    }
    
}
