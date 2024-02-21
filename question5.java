//write a program to print the row number having the maximum sum in a given matrix
import java.util.Scanner;

public class question5 {
    public static int findMaxSumRow(int[][] matrix) {
        int m = matrix.length;
        int n= matrix[0].length;
        int maxSum = 0  , maxRow =0 , currentSum=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                currentSum +=matrix[i][j];
                if(currentSum>maxSum){
                    maxRow = i;
                    maxSum = currentSum;
                }
            }
        }
        return maxRow;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();
        System.out.println("Enter matrix element: ");
        int[][] matrix = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
         int maxRow= findMaxSumRow(matrix);
        System.out.print("Row with max sum is "+maxRow);
        scan.close();
    }
}
