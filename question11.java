//given a positive integer n1 generate a n*n matrix filled with elements from 1 to n2 in spiral order

import java.util.Scanner;

public class question11 {
    public static int[][] spiralOrder(int[][] matrix){
        int n = matrix.length;
        int[][] res = new int[n][n];
        int minr = 0 , maxr = n-1;
        int minc = 0 , maxc=n-1;
        int num =1;
        while(num <= n*n){
            for(int j=minc; j<=maxc; j++){
                System.out.print(matrix[minr][j]+" ");
                res[minr][j]=num++;
            }
                minr++;
            if(minr<=maxr || minc <= maxc){
                for(int i=minr; i<=maxr; i++){
                    System.out.print(matrix[i][maxc]+" ");
                    res[i][maxc] = num++;
                }
                maxc--;
            }
            if(minr<=maxr || minc<=maxc){
                for(int j=maxc; j>=minc; j--){
                    System.out.print(matrix[maxr][j]+" ");
                    res[maxr][j] = num++;
                }
                maxr--;
            }
            if(minr<=maxr || minc<=maxc){
                for(int i=maxr; i>=minr; i--){
                    System.out.print(matrix[i][minc]+" ");
                    res[i][minc] = num++;
                }
                minc++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = scan.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Enter matrix element: ");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j]=scan.nextInt();
            }
        }
        for(int[] rows : matrix){
            for(int ele : rows){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println("Spiral order: ");
        int[][] res = spiralOrder(matrix);

        scan.close();
    }
}
