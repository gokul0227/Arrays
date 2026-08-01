import java.util.Scanner;

public class ConsecutiveOne {
    static int maximumConsecutive(int [] num){
        int max = 0;
        int count = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i] == 1){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }
        return max;
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
        System.out.println("Maximum consecutive one is : " + maximumConsecutive(arr));
    }
}
