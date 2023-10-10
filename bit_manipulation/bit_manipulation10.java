       // bit manipulation 
//  clear ith bit operation

public class bit_manipulation10 {

    public static int clearInBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    
    public static void main(String[] args) {
        System.out.println(clearInBit(10, 1));
    }
}

