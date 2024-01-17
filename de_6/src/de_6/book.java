/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_6;

/**
 *
 * @author nguye
 */
public class book {
    private int id;
    private String tacgia;
    private String tieude;
    private String category;

    public book() {
    }

    public book(int id, String tacgia, String tieude, String category) {
        this.id = id;
        this.tacgia = tacgia;
        this.tieude = tieude;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return id + "," + tacgia + "," + tieude + "," + category;
    }
    
}
