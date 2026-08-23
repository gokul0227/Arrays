import java.util.Arrays;
import java.util.Scanner;
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int longestNum = 1;
        int lastSmall = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] - 1 == lastSmall){
                count++;
                lastSmall= nums[i];
            }
            else if(nums[i] != lastSmall){
                count = 1;
                lastSmall= nums[i];
            }
            longestNum = Math.max(longestNum,count);
        }
        return longestNum;
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
        System.out.println("Longest Consecutive Sequence : " + longestConsecutive(arr));
    }
}
