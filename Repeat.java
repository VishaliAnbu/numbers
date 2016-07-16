/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repeat;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Repeat {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
       for(int i=0;i<a.length;i++)
       {
           a[i]=sc.nextInt();
       }
       Outer:for(int i=0;i<a.length;i++)
       {
           for(int j=i+1;j<a.length;j++)
           {
               if(a[i]==a[j])
               {
    System.out.println(a[i]);
                   break Outer;
}
           }
       }
       
    }}
