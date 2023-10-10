/* function to convert  decimal no. to binary no. */

import javax.sql.rowset.spi.SyncResolver;

public class function16 {
    public static void decToBin(int n){
        int pow=0;
        int binNum=0;
        int myNum=n;

        while (n>0) {
            int rem=n%2;
            binNum+=(rem*Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form : "+myNum+" is "+binNum);
    }
    public static void main(String[] args) {
        decToBin(5);
    }
}
