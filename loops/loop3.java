/* print the number from 1 to n using while loop */

import  java.util.*;
public class loop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        int n=sc.nextInt();
        int counter=1;

        while(counter<=n){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
}
