// String length function 

public class string2 {
    public static void printString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String Name="chandan kumar";
        System.out.println(Name.length());  // length() is a function in string
        
        // string concatenate
        String firstName="Aman";
        String lastName="Jha";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        //  string charAt method
        System.out.println("charAt(0) : "+fullName.charAt(0));
        String str="java Developer";
        printString(str);
    }
}
