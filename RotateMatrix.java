import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
    private static void reverse(int arr []){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static int[][] rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i + 1; j<matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i<matrix.length; i++){
            reverse(matrix[i]);
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
        System.out.println("Rotate Matrix : " + Arrays.deepToString(rotate(arr)));
    }
}
