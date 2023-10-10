/* check a student is pass or fail */

import java.util.*;
public class conditional_statement7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter marks : ");
        int marks=sc.nextInt();

        if(marks>=33)
        System.out.println("student is pass");
        else 
        System.out.println("student is fail ");
    }
}
