import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Union {
    static int [] unionOfSortedArray(int [] a, int [] b) {
        int lenA = a.length;
        int lenB = b.length;
        int left = 0;
        int right = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(left < lenA && right < lenB){
            if(a[left] <= b[right]){
                if(list.isEmpty() || list.get(list.size() - 1) != a[left]){
                    list.add(a[left]);
                }
                left++;
            }
            else{
                if(list.isEmpty() || list.get(list.size() - 1) != b[right]){
                    list.add(b[right]);
                }
                right++;
            }
        }
        while(left < lenA){
            if(list.get(list.size() - 1) != a[left]){
                list.add(a[left]);
            }
            left++;
        }
        while(right < lenB){
            if(list.get(list.size() - 1) != b[right]){
                list.add(b[right]);
            }
            right++;
        }
        int [] union = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            union[i] = list.get(i);
        }
        return union;
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the length of Array A : ");
        int lengthA = scanner.nextInt();
        int [] arrA = new int[lengthA];
        System.out.println("Enter the length of Array B : ");
        int lengthB = scanner.nextInt();
        int [] arrB = new int[lengthB];
        for(int i = 0; i < lengthA; i++){
            System.out.print("Enter the Array A "+i+" element : ");
            arrA[i] = scanner.nextInt();
        }for(int i = 0; i < lengthB; i++){
            System.out.print("Enter the Array B "+i+" element : ");
            arrB[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Union of sorted array is : " + Arrays.toString(unionOfSortedArray(arrA, arrB)));
    }
}
