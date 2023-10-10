/* java always use call by value */

public class function6 {
    public  static void changeA(int a){
        a=10;
        System.out.println("a value from changeA : "+a);
    }
    public static void main(String[] args) {
        int a=5;
        changeA(a); //in call by value it just send a copy to other function
        System.out.println("a value from main : "+a);
    }
}
