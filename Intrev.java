/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intrev;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Intrev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int s=0;
    while(a!=0)
    {
        s=(s*10)+a%10;
    a=a/10;
    
        
    }
        System.out.println("the reverse is:"+s);
}}
