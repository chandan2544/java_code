/* floyd's triangle
   1
   23
   456
   78910
 */

public class pattern8 {
    public static void floyd_triangle(int n){
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd_triangle(5);
    }
}
