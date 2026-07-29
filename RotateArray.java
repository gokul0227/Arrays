import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {
    static String  rotateArray(int [] num, int k){
        k = k % num.length;
        if(k == 0) return Arrays.toString(num);
        int [] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = num[i];
        }
        for(int i = k; i < num.length; i++){
            num[i - k] = num[i];
        }
        for(int i = num.length - k; i < num.length; i++){
            num[i] = temp[i - (num.length - k)];
        }
        return Arrays.toString(num);
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int length = scanner.nextInt();
        System.out.println("Enter k to rotate : ");
        int k = scanner.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Rotate array is : " + rotateArray(arr, k));
    }
}
