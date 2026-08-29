import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroes {
    public static int[][] setZeroes(int[][] matrix) {
        int col0 = 1;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }
        for(int i = 1; i<matrix.length; i++){
            for(int j = 1; j<matrix[i].length; j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j = 0; j<matrix[0].length; j++) matrix[0][j] = 0;
        }
        if(col0 == 0){
            for(int i = 0; i<matrix.length; i++) matrix[i][0] = 0;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int row = scanner.nextInt();
        System.out.println("Enter the column : ");
        int column = scanner.nextInt();
        int [][] arr = new int[row][column];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println("Set Matrix Zeroes : " + Arrays.deepToString(setZeroes(arr)));
    }
}
