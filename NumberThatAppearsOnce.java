import java.util.Scanner;
public class NumberThatAppearsOnce {
    static int numberThatAppearsOnce(int [] num){
        int temp = 0;
        for(int x : num){
            temp^=x;
        }
        return temp;
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
        System.out.println("Number : " + numberThatAppearsOnce(arr));
    }
}
