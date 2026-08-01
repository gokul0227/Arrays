import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {
    static ArrayList<Integer> intersectionOfTwoSortedArrays(int [] a, int [] b){
        ArrayList<Integer> list = new ArrayList<>();
        int lenA = a.length;
        int lenB = b.length;
        int left = 0;
        int right = 0;
        while(left < lenA && right < lenB){
            if(a[left] < b[right]){
                left++;
            }
            else if (a[left] > b[right]) {
                right++;
            }
            else{
                list.add(a[left]);
                left++;
                right++;
            }
        }
        return list;
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
        System.out.println("Intersection of two sorted arrays is : " + intersectionOfTwoSortedArrays(arrA,arrB));
    }
}
