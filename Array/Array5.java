/* find largest no. & smallest no. from list */

public class Array5 {
    public static int getLargestNum(int list[]){
        int largestNum=Integer.MIN_VALUE;// -infinity
        int smallestNum=Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if(largestNum<list[i]){
                largestNum=list[i];
            }if(smallestNum>list[i]){
                smallestNum=list[i];
            }
        }
        //  function can return only one value so
        System.out.println("smallest no. : "+smallestNum);
        return largestNum;
    }
    public static void main(String[] args) {
       int list[]={1,2,6,3,5};
       for (int i = 0; i < list.length; i++) {
        System.out.print(list[i]+" ");
       }
       System.out.println();
        System.out.println("largest no. : "+getLargestNum(list));
    }
}
