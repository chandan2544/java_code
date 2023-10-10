// count set bit in numbers

public class bit_manipulation15 {
   
   public static int countSetInBits(int n){
    int  count=0;
    while (n>0) {
        if ((n&1) !=0) {
            count++;
        }
        n=n>>1;
    }
    return count;
   }
    public static void main(String[] args) {
        System.out.println(countSetInBits(10));
    }
}
