/* keep entering the number till user enter multiple of 10 */

import java.util.*;
public class loop11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        do {
            System.out.print("enter number : ");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
