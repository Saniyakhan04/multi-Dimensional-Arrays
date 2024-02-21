// write a program to rotate the matrix by 90 degree anticlockwise
import java.util.Scanner;

public class question09 {
   public static void reverseRow(int[][] matrix , int row){
        // reverse particular row
        int size = matrix.length;
        int start =0 , end = size - 1;
        int temp;
            while(start<end) {
                 temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
                start++;
                end--;
            }
        }
        public static void reverse(int[][] matrix){
            int size=matrix.length;
            for(int i=0; i<size; i++){
                reverseRow(matrix, i);
            }
        }

    public static void transpose(int[][] matrix ){
        int m = matrix.length;
        // transpose particular row
        for(int i=0; i<m; i++ ){
            for(int j=0; j<=i; j++ ){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }