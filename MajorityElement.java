import java.util.Scanner;

public class MajorityElement {
    static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int i : nums){
            if(count == 0){
                count++;
                element = i;
            }
            else if(i == element){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int i : nums){
            if(i == element) count1++;
        }
        if(count1 > nums.length / 2){
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Majority element : " + majorityElement(arr));
    }
}
