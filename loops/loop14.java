/* check if a number is prime  or not */

import java.util.*;
public class loop14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        int n=sc.nextInt();

        if(n==2){
            System.out.println(n+" is prime");
        }else{
            boolean isPrime=true;
            for (int i = 2; i < n-1; i++) {
            // for (int i = 2; i < math.sqrt(n); i++)
            // its more optimized
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println(n+" is prime ");
            }else{
                System.out.println(n+" is not prime");
            }
        }
    }
}
