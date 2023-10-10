// inbuilt Reverse sorting function in java

import java.util.Arrays;  // include this line for inbuilt sorting
import java.util.Collections;
public class sorting10 {
    
    public static void main(String args[]) {
        Integer arr[] = { 5, 4, 1, 3, 2, }; // here integer is a object 

         Arrays.sort(arr,Collections.reverseOrder());  // inbuilt sorting

        // these lines to print the sorted  array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

