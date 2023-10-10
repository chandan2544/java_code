/* function to find factorial of given no. */

import java.util.*;
public class function8 {
    public static int factorial(int n){
        int f=1;
        for (int i = 1; i <= n; i++) {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no. : ");
        int n=sc.nextInt();

        System.out.println("factorial : "+factorial(n));
    }
}
