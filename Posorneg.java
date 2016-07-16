/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posorneg;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Posorneg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    int i=sc.nextInt();
    if(i>=0)
    {
        System.out.println("positive"+i);
    }
    else
    {
         System.out.println("negative"+i);
    }
    }}
       
        
   