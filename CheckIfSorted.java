import java.util.Scanner;

public class CheckIfSorted {
    static boolean ifSorted(int[] num) {
        for (int i = 1; i < num.length; i++) {
            if (num[i] >= num[i - 1]) ;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Check if sorted : " + ifSorted(arr));
    }
}