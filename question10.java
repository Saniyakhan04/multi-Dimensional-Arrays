//write a program to print the matrix in waveform
import java.util.Scanner;

public class question10 {
    public static void waveform(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;
        for(int j=0; j<column; j++){
            if(j%2==0){
                for(int i=row-1; i>=0; i--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            else{//i%2!=0
                for(int i=0; i<row; i++){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = scan.nextInt();
        System.out.print("Enter column number: ");
        int column = scan.nextInt();
        System.out.print("Enter matrix element: ");
        int[][] matrix = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j]= scan.nextInt();
            }
        }
        waveform(matrix);
        for(int[] rows : matrix){
            for(int ele : rows){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
