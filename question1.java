//write a program to store 10 at every index of a 2D matrix with 5 rows and 5 columns
public class question1 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for(int[] ary : matrix){
            for(int ele : ary){
                ele = 10;
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
