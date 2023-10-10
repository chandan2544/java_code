/* function with return type & with argument */

import java.util.Scanner;
public class function4 {
    public static int calcSum(int a,int b){  // parameters or formal parameters
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number a,b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calcSum(a,b);  // Arguments or actual parameters

        System.out.println("sum : "+sum);
    }
}
