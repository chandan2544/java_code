/* patern4
  A
  BC
  DEF
  GHIJ
 */

 import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char chars='A';

        for (int i = 1; i <= n; i++) {
            for(int ch=1;ch<=i;ch++){
                System.out.print(chars);
                chars++;
            }
            System.out.println();
        }
    }
}
