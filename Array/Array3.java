/* Arrays passing as a Argument */

public class Array3 {
    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i]+=1; 
        }
    }
    public static void main(String[] args) {
        int marks[]={98,90,78}; 
        update(marks);
        
        // to print 
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
