/* break statement in loop */

public class loop10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out from loop ");
    }
}
