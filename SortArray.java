import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
    static int [] sortArr(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
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
        System.out.println("Sort an array of 0's 1's and 2's : " + Arrays.toString(sortArr(arr)));
    }
}
