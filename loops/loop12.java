/* continue statement in loop */

public class loop12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("i iterated from loop ");
    }
}
