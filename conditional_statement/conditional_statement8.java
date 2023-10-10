/* SYNTAX OF SWITCH CASE IN JAVA */

import java.util.*;
public class conditional_statement8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("choose items from menu card : ");
        int menu=sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("noodeles");
                break;
            case 3:
                System.out.println("pizza");
                break;
            default:
                System.out.println("chai or biscuit");
                break;
        }
    }
}
