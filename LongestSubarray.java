import java.util.Scanner;
public class LongestSubarray {
    static int longestSubarray(int [] num, int k){
        int left = 0;
        int right = 0;
        int sum = 0;
        int len = 0;
        while(right < num.length){
            sum+=num[right];
            while(sum > k){
                sum-=num[left];
                left++;
            }
            if(sum == k) {
                len = Math.max(len, right - left + 1);
            }
            right++;
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int length = scanner.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the Sum : ");
        int k = scanner.nextInt();
        scanner.close();
        System.out.println("Longest subarray with sum k is : " + longestSubarray(arr,k));
    }
}
