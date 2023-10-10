/* print the sum of first n natural number */

import java.util.*;
public class loop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter number : ");
        int  n=sc.nextInt();
        int sum=0;
        int i=0;
        while (i<=n) {
            sum=sum+i;
            i++;
        }
        System.out.println("sum of first "+n+" natural number is "+sum);
    }
}
