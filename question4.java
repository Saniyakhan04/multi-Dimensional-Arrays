//write a program to find the largest element of a given 2D array of integer
import java.util.Scanner;

public class question4 {
    public static int findMax(int[][] matrix){ // method to find the max element in the matrix
        int maxElement = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            for (int element : row) {
                maxElement = Integer.max(maxElement, element);
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.print("Enter elements of matrix : ");
        for (int i = 0; i < rows; i++) { // taking input of matrix
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxElement = findMax(matrix);

        System.out.println("Max element in the matrix is : " + maxElement);

        sc.close();
    }
}