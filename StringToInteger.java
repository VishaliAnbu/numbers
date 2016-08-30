/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string.to.integer;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class StringToInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int a= Integer.parseInt(str);
        System.out.println("ans:"+a);
    }
}
