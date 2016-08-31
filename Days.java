/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package days;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Days {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         if(s.equalsIgnoreCase("sunday"))
            System.out.println("Holiday");
        else
            if(s.equalsIgnoreCase("monday")||s.equalsIgnoreCase("tuesday")||s.equalsIgnoreCase("wednesday")||s.equalsIgnoreCase("thursday")||s.equalsIgnoreCase("friday")||s.equalsIgnoreCase("saturday"))
        System.out.println("Working day");
    else
         System.out.println("Enter valid day");       
}

}