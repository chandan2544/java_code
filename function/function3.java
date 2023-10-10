/* function with no return type & with argument */

import java.util.Scanner;
public class function3 {
    public static void calcSum(int a,int b){
        int sum=a+b;
        System.out.println("sum : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number a,b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        calcSum(a,b);
    }
}
