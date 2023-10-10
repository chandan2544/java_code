/* SYNTAX OF CONDITIONAL STATEMENT if and  else if */

import java.util.Scanner;

public class conditional_statement1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("enter age : ");
    int age = sc.nextInt();

    if(age>=18){
        System.out.println("Adult");
    }
    if(age>13 && age<18){
        System.out.println("Teenage");
    }
    else{
        System.out.println("Child");
    }
}
}