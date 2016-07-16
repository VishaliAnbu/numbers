/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicates;

/**
 *
 * @author Student
 */
public class Duplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String str="vishali";
   char a;
   String s2="";
   for(int i=0;i<str.length();i++)
   {
       a=str.charAt(i);
       if(a!=' ')
       {
           s2=s2+a;
           str=str.replace(a, ' ');
       }
   }
        System.out.println("the string is:"+s2);
    }
}
