/* reverse an Array */

public class Array7 {
   public static void revArray(int list[]){
    int fd=0,ld=list.length-1;

    while (fd<ld) {  //fd-firstdigit & ld=lastdigit
        //swap
        int temp=list[ld];
        list[ld]=list[fd];
        list[fd]=temp;

        fd++;
        ld--;
    }
   }
    public static void main(String[] args) {
        int list[] = { 2, 4, 6, 8, 10, 12, 14, 16 };

        revArray(list);
        //print
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();

    }
}
