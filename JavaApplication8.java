/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
   int sum=0;
   while(n>0)
   {
       int temp,n1;
       temp=n%10;
       n1=123;
       n1=n1*temp;
       n=n/10;
       
   sum=sum+n1;
    }
           System.out.println("123 is a seed of "+sum);
    }
}
