/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de_2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class De_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            docfile.doc_file();
        } catch (IOException ex) {
            Logger.getLogger(De_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO code application logic here
        bang form = new bang();
        form.setVisible(true);
        //System.out.println(dsnv.ds.size());
    }
    
}
