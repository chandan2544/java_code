// note  string in java are immutable

import java.util.*;
public class string1 {
public static void main(String[] args) {

    // string declaration syntax in java
    char arr[]={'a','b','c','d'};
    String str1="abcd";
    String str2=new String("abcd");

    // string output
    System.out.println(arr);
    System.out.println(str1);
    System.out.println(str2);

    //string input
    Scanner sc=new Scanner(System.in);
    // String name=sc.next(); // next output only single word before space
    String name=sc.nextLine();// nextLine(); output whole line

    System.out.println(name);
}
}