/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repeated.pkgchar;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class RepeatedChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c=0;
       char n[]=new char[50];
        char ch[]=new char[50];
        int a[]=new int[50];
        String s="String with maximum numbers of repeated letters";
        String []str=s.split(" ");
        for(String w:str)
            outer:  for(int i=0;i<str.length;i++)
        {
          c=0;
         ch=str[i].toCharArray();
         for(int j=0;j<ch.length;j++)
          {
              for(int k=j+1;k<ch.length;k++)
            {
              if(ch[j]==ch[k])
              {
               n[i]=ch[k];
                 c++;
                 a[i]=c;
               }
              else 
                     continue;
             }
        }
           System.out.println("a:"+c+" "+n[i]);
    
        
}
        
}
    }