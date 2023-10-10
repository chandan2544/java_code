/* inverted & half rotated pyramid
          *
         **
        ***
       **** 
 */

public class pattern6 {
    public static void inv_half_pyramid(int n){
        for (int i = 1; i <=n; i++) {
            // space
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inv_half_pyramid(5);
    }
}
