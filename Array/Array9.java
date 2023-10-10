/* print SubArray from given list in  java */

public class Array9 {
    public static void printSubArray(int list[]) {
        int ts=0;
        for (int i = 0; i < list.length; i++) {
            int start = i;
            for (int j = i; j < list.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(list[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total SubArrays : "+ts);
    }

    public static void main(String[] args) {
        int list[] = { 2, 4, 6, 8, 10 };
        printSubArray(list);
    }
}
