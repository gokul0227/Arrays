import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
    static int missingElement(int [] arr, int num){
        int N = num * (num + 1)/2;
        int sum = 0;
        for (int x : arr){
            sum+=x;
        }
        return N - sum;
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int length = scanner.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the N value : ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Missing Element is : " + missingElement(arr, n));
    }
}
