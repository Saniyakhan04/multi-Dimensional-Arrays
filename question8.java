import java.util.Scanner;

// Write a program to print the elements of both diagonals in a square matrix
public class question8 {
    public static void diagonalSquareMatrix(int[][] matrix){
        int size= matrix.length;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if((i==j)|| (i+j==size-1)){
                    System.out.print(matrix[i][j]+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = scan.nextInt();
        System.out.println("Enter matrix element: ");
        int[][] matrix = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j]=scan.nextInt();
            }
        }
        diagonalSquareMatrix(matrix);
        scan.close();
    }
}
