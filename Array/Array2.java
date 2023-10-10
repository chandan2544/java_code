/* input , output , update Syntax in java */
 
import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        int marks[]=new int [30];
        Scanner sc=new Scanner(System.in);
        //input
        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//bio

        //output
        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("bio : "+marks[2]);

        //update
        marks[1]+=5;
        System.out.println("chem updated marks : "+marks[1]);

        float percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println(percentage+"%");

        //find length of array
        System.out.println("length of array : "+marks.length);
        sc.close();
    }
}
