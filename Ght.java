/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ght;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Ght {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    Scanner sc=new Scanner(System.in);
  int i=sc.nextInt();
  if(i%2==0)
  {
      System.out.println("even"+i);
  }
  else
            System.out.println("odd"+i);
    }
}
