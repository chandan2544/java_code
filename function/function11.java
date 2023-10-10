/* function overloading :- multiple function with the same name but different parameter */
// distinguish by two types 1. parameter datatype 2. parameter no of argument

public class function11 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.out.println(sum(3.1f, 5.04f));
    }
}
