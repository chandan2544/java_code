/* function overloading :- multiple function with the same name but different parameter */
// distinguish by two types 1. parameter datatype 2. parameter no of argument

public class function10 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 8));
        System.out.println(sum(7, 4, 6));
    }
}
