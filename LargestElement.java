import java.util.Scanner;

public class LargestElement {
    static int largestElementInArray(int [] num){
        int largestEle = num[0];
        for(int i = 1; i < num.length; i++){
            if(largestEle < num[i]){
                largestEle = num[i];
            }
        }
        return largestEle;
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
        System.out.println("Largest Element is : " + largestElementInArray(arr));
    }
}
