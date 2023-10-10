//  2D Array representation

import java.util.*;
public class _2d_Array1 {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int m=matrix.length;  //m=matrix.length  for row
        int n=matrix[0].length; // n=matrix[0].length for column

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}