/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        for (int i=0;i<s.length();i++)
        if(s.length()==0)
        {
            System.out.println(" ");
        }
        if(s.length()==1)
        {
           System.out.println(s.charAt(0)); 
        }
         if(s.length()>0)
         {
             for(int i=0;i<s.length();i++)
             {
                 for(int j=0;j<s.length();j++)
                 {
              s.charAt(i);
             }
                  System.out.println(s.charAt(i));
         }
            
    }
}}
