/* INCOME TAX CALCULATOR */

import java.util.*;
public class conditional_statement4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter income : ");
         int income=sc.nextInt();
         int tax=0;

         if(income < 500000){
            tax=0;
         }else if(income>500000 && income<1000000){
            tax= (int)(income*.20);
         }else{
            tax= (int)(income*.30);
         }
         System.out.println("tax is "+tax);
    }
}
