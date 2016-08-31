/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrams;

import java.util.Scanner;
import java.util. Arrays;
/**
 *
 * @author Student
 */
public class Anagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         String s1=sc.nextLine();
      //  String str=new StringBuffer(s1).reverse().toString();
        char []c=s.replaceAll("\\s","").toCharArray();
        char []d=s1.replaceAll("\\s","").toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if( Arrays.equals(c,d))
            {
            System.out.println("Anagrams");
        }
        else
            {
             System.out.println("Not Anagrams");
        }
    }
}
