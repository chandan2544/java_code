// program for insertion sort in array 

public class sorting5 {

    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
// finding out correct position to insert
            while ((prev >= 0) && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insert
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2, };
        insertion_sort(arr);
        printArr(arr);
    }
}
