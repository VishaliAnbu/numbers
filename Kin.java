/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kin;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Kin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
       System.out.println("enter n value");
        int n=sc.nextInt(); int j=1;
	for(int i=0;i<2*n;i++)	
        {int x=2*n-i;
	  if(n!=x) 
           {
             System.out.println(" "+j++ +"  "+"  "+x);  
              }		
	       }
    }
}
