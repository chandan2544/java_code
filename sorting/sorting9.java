// inbuilt sorting function in java

import java.util.Arrays;  // include this line for inbuilt sorting
public class sorting9 {

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2, };

         Arrays.sort(arr);  // inbuilt sorting

        // these lines to print the sorted  array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
