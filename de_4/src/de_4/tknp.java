/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_4;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author nguye
 */
public class tknp {
    
    public static word tk(String x) {
        danhsach.nhap();
        Collections.sort(danhsach.ds, Comparator.comparing(word::getEng));
        int i = 0;
        int p = danhsach.ds.size() - 1;

        while (i <= p) {
            int g = (p + i) / 2;
            int comparisonResult = danhsach.ds.get(g).getEng().compareTo(x);

            if (comparisonResult == 0) {
                return danhsach.ds.get(g);
            } else if (comparisonResult < 0) {
                i = g + 1;
            } else {
                p = g - 1;
            }
        }
        return null;
    }
}
