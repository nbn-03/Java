/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_6;

/**
 *
 * @author nguye
 */
public class category {
    private String id;
    private String type;

    public category() {
    }

    public category(String id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "category{" + "id=" + id + ", type=" + type + '}';
    }
    
}
