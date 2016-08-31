/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vowels;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Vowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str=new StringBuffer(s).reverse().toString();
        //System.out.println("ans:"+str);
        System.out.println(str.replaceAll("[a,e,i,o,u]",""));
        
    }
}
