/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author nguye
 */
public class SearchString {
    public int search(String s1, String s2)
    {
        if(s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty() || s2.length() > s1.length())
        {
            return -1;
        }
        else
        {
            for (int i = 0; i<=(s1.length()-s2.length());i++)
            {
               int dem = 0;
               for (int j =0;j<s2.length();j++)
               {
                   if(s1.charAt(i+j) != s2.charAt(j))
                       break;
                   else 
                       dem = dem +1;
               }
               if(dem == s2 .length())
               {
                   return i;
               }
            }
            return -1;
        }
    }
}
