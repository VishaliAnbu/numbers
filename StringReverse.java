/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string.reverse;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=new String();
         String s1=new String();
        s=sc.nextLine();
       
        s1=new StringBuffer(s).reverse().toString();
        System.out.println("the string is:"+s1);
        
        
    }
}
