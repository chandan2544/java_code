/* ternary operator syntax in java */

import java.util.*;
public class conditional_statement6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int number=sc.nextInt();

        String check =(number%2==0)? "even" : "odd";
        System.out.println(check);
    }
}
