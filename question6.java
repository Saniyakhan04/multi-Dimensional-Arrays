/* write a function which accept a 2D integers and its size as arguments and display the elements of middle row and the elements of middle column
 */
import java.util.Scanner;

public class question6 {
    public static void displayMiddleElement(int[][] matrix , int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i==size/2 || j==size/2){
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
                matrix[i][j] = scan.nextInt();
            }
        }
        displayMiddleElement(matrix , size);
        scan.close();
    }
}