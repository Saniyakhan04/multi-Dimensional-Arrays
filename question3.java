// Given a matrix A of dimension n*m and 2 coordinates (l1 , r1) and (l2 , r2) return the sum of the rectangle from (l1 , r1) to (l2 , r2)
import java.util.Scanner;

public class question3 {
    public static int sumOfRectangle(int[][] A , int l1 , int l2 , int r1 , int r2){
        int sum = 0;
        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum+=A[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = scan.nextInt();
        System.out.print("Enter number of column: ");
        int column = scan.nextInt();
        System.out.print("Enter l1: ");
        int l1 = scan.nextInt();
        System.out.print("Enter r1: ");
        int r1 = scan.nextInt();
        System.out.print("Enter l2: ");
        int l2 = scan.nextInt();
        System.out.print("Enter r2: ");
        int r2 = scan.nextInt();
        System.out.println("Enter matrix element: ");
        int[][] A = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                A[i][j] = scan.nextInt();
            }
        }
       int sum = sumOfRectangle(A , l1 , l2 , r1 , r2);
        System.out.print("The sum is "+sum);
    }
}
