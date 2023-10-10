/* print reverse number in java */

public class loop7 {
    public static void main(String[] args) {
        int n=10899;
        while (n>0) {
            int Lastdigit=n%10;
            System.out.print(Lastdigit+" ");
            n=n/10;
        }
        System.out.println();
    }
}
