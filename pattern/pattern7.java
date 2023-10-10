/* inverted half  pyramid with number
   12345
   1234
   123
   12
   1
 */

public class pattern7 {
    public static void inv_half_pyramid_number(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inv_half_pyramid_number(5);
    }
}
