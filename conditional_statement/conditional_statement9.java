/* calculator in java using switch case */

import java.util.*;
public class conditional_statement9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a : ");
        int a=sc.nextInt();
        System.out.print("enter b : ");
        int b=sc.nextInt();
        System.out.print("choose +,-,*,/,% : ");
        char operator=sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("sum : "+(a+b));
                break;
            case '-':
                System.out.println("subtraction : "+(a-b));
                break;
            case '*':
                System.out.println("multiply : "+(a*b));
                break;
            case '/':
                System.out.println("divison : "+(a/b));
                break;
            case '%':
                System.out.println("modulo : "+(a%b));
                break;
            default:
                break;
        }
    }
}
