import java.util.Scanner;

public class SecondLargest {
    static int secondLargestElement(int [] num){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++){
            if (first < num[i]){
                second = first;
                first = num[i];
            } else if (second < num[i] && first != num[i]) {
                second = num[i];
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int length = scanner.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(" Second largest Element is : " + secondLargestElement(arr));


    }
}
