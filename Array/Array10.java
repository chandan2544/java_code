/* print Max Sub Array sum from given list */
// from brute force  approach

public class Array10 {
    public static void MaxSubArray(int list[]) {
            int currSum=0;
            int maxSum=Integer.MIN_VALUE;
            for (int i = 0; i < list.length; i++) {
                int start = i;
                for (int j = i; j < list.length; j++) {
                    int end = j;
                    currSum=0;
                    for (int k = start; k <= end; k++) {
                        currSum+=list[k];
                    }
                    System.out.println(currSum);
                    if(maxSum<currSum){
                        maxSum=currSum;
                    }
                }
            }
            System.out.println("max Sum : "+maxSum);
        }

    public static void main(String[] args) {
        int  list[]={1,-2,6,-1,3};
        MaxSubArray(list);
    }
}
