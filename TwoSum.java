import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    static int [] twoSum(int [] num, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<num.length; i++){
            int comp = target - num[i];
            if(map.containsKey(comp)){
                return new int [] {map.get(comp), i};
            }
            map.put(num[i],i);
        }
        return new int [] {};
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int length = scanner.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target value : ");
        int target = scanner.nextInt();
        scanner.close();
        System.out.println("Index of Two sum is : " + Arrays.toString(twoSum(arr, target)));
    }
}
