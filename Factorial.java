/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
    System.out.println("enter a value");
    int i,f=1,num;
    num=sc.nextInt();
    for(i=1;i<=num;i++){
        f=f*i;
 }
    System.out.println(f);

    }
}
