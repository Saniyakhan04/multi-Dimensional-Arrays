//Given an m*n integer matrix , if an element is 0 set the entire row and column to 0's 
import java.util.Scanner;
public class question13 {
    public static void setZero(int[][] matrix) {
        int rows= matrix.length;
        int columns= matrix[0].length;
        boolean zeroRow = false;
        boolean zeroCol = false;
        //check if the 0th row has any zero
        for(int j=0; j<columns; j++){
            if(matrix[0][j]==0){
                zeroRow = true;
                break;
            }
        }
        //check if the 0th column has any zero
        for(int i=0; i<rows; i++){
            if(matrix[i][0]==0){
                zeroCol = true;
                break;
            }
        }
        //traverse in matrix without 0th row & oth col
        for(int i=1; i<rows; i++){
            for(int j=1; j<columns; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        // travers in the row
        for(int j=1; j<columns ; j++){
            if(matrix[0][j]==0){
                for(int i=1; i<rows; i++){
                    matrix[i][j]=0;
                }
            }
        }
        //traverse in column
        for(int i=1; i<rows; i++){
            if(matrix[i][0]==0){
                for(int j=1; j<columns; j++){
                    matrix[i][j]=0;
                }
            }
        }
        if(zeroRow==true){
            for(int j=0; j<columns; j++){
                matrix[0][j]=0;
            }
        }
        if(zeroCol==true){
            for(int i=0; i<rows; i++){
                matrix[i][0]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns:");
        int columns = scan.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.print("Enter matrix element: ");
        // taking matrix input
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        setZero(matrix);
        for(int[] row : matrix){
            for(int ele : row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}