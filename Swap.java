/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int n=sc.nextInt();
       for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=2;i<a.length;i++)
        {
             if(a[i]%i==0)
             {
                 System.out.println("not prime");   
                 break;
             }
             else
             {
                 count++;
                 System.out.println("prime:"+count);
             }
        }
       
    }
}
