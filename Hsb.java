/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hsb;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Hsb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ob=new Scanner(System.in);
                int b[]=new int[5];
               
    for(int i=0;i<b.length;i++)
    {
    b[i]=ob.nextInt();
    }
    for(int i=1;i<b.length;i++)
    {
        if(i==b[i])
        {
      
     System.out.println(b[i]);  }
}}}
