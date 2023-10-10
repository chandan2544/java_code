/* linear search in java */

public class Array4 {
    public static  int linearSearch(int number[],int key){
        for (int i = 0; i < number.length; i++) {
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        int index=linearSearch(numbers, key);
        if(index==-1){
            System.out.println("search not found");
        }else{
            System.out.println(key+" is at index "+index);
        }
    }
}
