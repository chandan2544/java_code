/* pairs in List  java */

public class Array8 {
    
    public static void printPair(int list[]){
        for (int i = 0; i < list.length; i++) {
            int current=list[i];
            for (int j = i+1; j < list.length; j++) {
                System.out.print("("+current+","+list[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int list[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        printPair(list);
    }
}
