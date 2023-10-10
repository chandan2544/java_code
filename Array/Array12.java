/* print Max Sub Array sum from given list */
// kadans approch

public class Array12 {
    public static void MaxSubArray(int list[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for (int i = 0; i < list.length; i++) {
            cs=cs+list[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        System.out.println("Max.Sum of subarray : "+ms);
    }
    public static void main(String[] args) {
        int list[]={-2,-3,4,-1,-2,1,5,-3};
        MaxSubArray(list);
    }
}
