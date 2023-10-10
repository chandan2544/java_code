//searching in sorted matrix by stair search  method

import java.util.*;
// import java.rmi.server.RemoteRef;
public class _2d_Array4 {

        public static boolean search_matrix(int matrix[][], int key){
            int row = 0, col = matrix[0].length-1;
    
            while(row<matrix.length && col>=0){
                if(matrix[row][col]==key){
                    System.out.print("found at key "+"("+ row+","+ col+")");
                    return true;
                }
    
                else if (key <matrix[row][col]){
                    col--;
                }
    
                else if (key >matrix[row][col]){
                    row++;
                }
            }
            System.out.println("Key not found in that matrix");
        return false;
            
        }
        public static void main(String args[]){
            int matrix[][] =  { { 10,20,30,40},
                                { 15,25,35,45},
                                {27,29,37,48},
                                { 32,33,39,50} };
    
            int key = 33;
    
            search_matrix(matrix, key);
        }
        
    }
