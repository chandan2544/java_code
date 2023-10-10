/* function of swapping two numbers */

import java.util.*;
public class function5 {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a,b for swapping : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swapping ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        swap(a, b);

        
    }
}
