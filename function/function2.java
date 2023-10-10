/* program of function without returntype & without argument */

import java.util.*;
public class function2 {
    public static void calcSum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number a,b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("sum : "+sum);
    }
    public static void main(String[] args) {
        calcSum();
    }
}
