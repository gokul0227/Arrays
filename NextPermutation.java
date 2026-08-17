import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
     static void reverse(int arr [], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int [] nextPermutation(int[] nums) {
        int ind = -1;
        int len = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(nums,0,len);
            return nums;
        }
        for(int i = len; i >= ind; i--){
            if(nums[i] > nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }
        reverse(nums, ind + 1, len);
        return nums;
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int length = scanner.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Next Permutation is : " + Arrays.toString(nextPermutation(arr)));
    }
}
