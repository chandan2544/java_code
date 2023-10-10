/* print the largest of 3 numbers */

import java.util.*;
public class conditional_statement5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("enter a ,b , c : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is laragest : "+a);
        }else if(b>a && b>c){
            System.out.println("b is largest : "+b);
        }else{
            System.out.println("c is largest : "+c);
        }
    }
}
