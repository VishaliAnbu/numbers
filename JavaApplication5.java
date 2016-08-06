/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Student
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a);
    }
}
