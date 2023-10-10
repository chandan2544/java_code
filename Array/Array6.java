// /* binary Search in java */

// public class Array6 {
//     public static int binSearch(int list[],int key){
//         int start=0;
//         int end=list.length-1;

//         while (start<=end) {
//             int mid=(start+end)/2; //
//             if(mid==key){
//                 return mid;
//             }
//             if(list[mid]<key){ //right
//                  start=mid+1;
//             }else{ //left
//                  end=mid-1;  
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int list[]={2,4,6,8,10,12,14,16};
//         int key=16;

//         System.out.println("index of key : "+binSearch(list, key));
//     }
// }

public class Array6 {
    public static int binSearch(int list[], int key) {
        int start = 0;
        int end = list.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index correctly
            if (list[mid] == key) {
                return mid; // Key found, return its index
            }
            if (list[mid] < key) {
                start = mid + 1; // Adjust the start index
            } else {
                end = mid - 1; // Adjust the end index
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int list[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 16;

        int result = binSearch(list, key);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the list.");
        }
    }
}

