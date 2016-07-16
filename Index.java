/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc=new Scanner(System.in);
                int a[]=new int[5];
                int t;
    for(int i=0;i<a.length;i++)
    {
    a[i]=sc.nextInt();
    }
    for(int i=1;i<a.length;i++)
    {
        if(i==a[i])
        {
      
     System.out.println(a[i]);  
            
        }
        
   }
   }
}
