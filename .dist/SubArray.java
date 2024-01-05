import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array 1
        System.out.print("Enter the size of arr1: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of arr1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input array 2
        System.out.print("Enter the size of arr2: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of arr2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        if (subarray(arr1, arr2)) 
            System.out.println("YES IT IS A SUBSET");
         else 
            System.out.println("NO IT IS NOT A SUBSET");
        
    }

    public static boolean subarray(int[] arr1, int[] arr2) {
        Set<Integer> eshak = new HashSet<>();
        for (int num : arr2) {
            eshak.add(num);
        }

        for (int num : arr1) {
            if (!eshak.contains(num)) 
                return false;
        }
        return true;
    }
}
