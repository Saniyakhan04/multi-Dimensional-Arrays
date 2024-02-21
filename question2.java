//write a program to add to matrices and save the result in one of the given matrix
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int column = scan.nextInt();
        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        System.out.print("Enter element of first matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix1[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter element of second matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix2[i][j] = scan.nextInt();
            }
        }
        System.out.print("Enter result matrix: ");
        int[][] res = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                res[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i=0; i<row ; i++){
            for(int j=0; j<column; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
