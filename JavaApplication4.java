/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
       TreeSet ts = new TreeSet();
      int []n=new int[10];
       int b[]=new int[10];
      for(int i=0;i<n.length;i++)
      {
             n[i]=sc.nextInt();
      }
     for(int i=0;i<n.length;i++)
     {
      ts.add(n[i]);
       System.out.println(ts);
     }
    } }
