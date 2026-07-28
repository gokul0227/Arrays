import java.util.Scanner;

public class RemoveDuplicate {
    static int removeDuplicateInPlaceFromSortedArray(int [] num){
        int left = 0;
        int right = 1;
        while(right <= num.length - 1){
            if(num[left] != num[right]){
                left++;
                num[left] = num[right];
                right++;
            }
            else{
                right++;
            }
        }
        return left + 1;
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
        System.out.println("Length of remove duplicate Element is : " + removeDuplicateInPlaceFromSortedArray(arr));
    }
}
