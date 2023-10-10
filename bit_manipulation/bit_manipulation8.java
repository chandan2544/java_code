// bit manipulation 
//  get ith bit operation

public class bit_manipulation8 {
    public static int getInBit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getInBit(10, 2));
    }
}
