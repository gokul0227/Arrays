import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        //Row starting
        int top = 0;
        //Row ending
        int bottom = matrix.length - 1;
        //column starting
        int left = 0;
        //column ending
        int right = matrix[0].length - 1;
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
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
        System.out.println("Spiral Matrix : " + spiralOrder(arr));
    }
}
