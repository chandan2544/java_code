/* SYNTAX OF CONDITIONAL STATEMENT */

import java.util.*;
public class conditional_statement3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter age : ");
    int age=sc.nextInt();

    if(age>=18){
        System.out.println("Adult");
    }
    else if(age>=13 && age<18){
        System.out.println("Teenager");
    }else{
        System.out.println("Child");
    }
}
}