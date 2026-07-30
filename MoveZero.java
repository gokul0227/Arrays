import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {
    static String moveZero(int [] num){
        int temp[] = new int[num.length];
        int index = -1;
        for(int i = 0; i < num.length; i++){
            if(num[i] != 0){
                index++;
                temp[index] = num[i];
            }
        }
        return Arrays.toString(temp);
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
        System.out.println(moveZero(arr));
    }
}
