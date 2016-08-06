/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc=new Scanner(System.in);
               String s=sc.nextLine();;
      String a[]=new String[s.length()-2];
        for(int i=0;i<s.length()-2;i++)
        {
            a[i]=s.substring(i,i+3);
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        System.out.println("small"+"  "+a[0]);
        System.out.println("larg"+"  "+a[a.length-1]);
    }

    }

