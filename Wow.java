/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wow;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Wow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
       int a[]=new int[10];
       for(int i=0;i<a.length;i++)
       {
           a[i]=sc.nextInt();
       }
       for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]==a[j])
               {
                   a[i]=-1;
                   a[j]=-1;
               }
                   
           }
       }
           
       for(int i=0;i<a.length;i++)
       {
           if(a[i]!=-1)
       
       System.out.println(a[i]);  
    }
}}

    

