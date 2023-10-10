// print Max Sub Array sum from given list
// prefix approach

public class Array11 {

    public static void MaxSubArray(int list[]) {
            int currSum=0;
            int maxSum=Integer.MIN_VALUE;
            int prefix[]=new int[list.length];

            prefix[0]=list[0];
            // calculate prefix Array
            for (int i = 1; i < prefix.length; i++) {
                prefix[i]=prefix[i-1]+list[i];
            }
            for (int i = 0; i < list.length; i++) {
                int start = i;
                for (int j = i; j < list.length; j++) {
                    int end = j;
                    currSum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];

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