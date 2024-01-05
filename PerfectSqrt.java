
import java.util.*;

public class PerfectSqrt {

    public static boolean Perfect(int num) {
        if (num < 0) {
            return false;
        }
    
        int NO = (int)Math.sqrt(num);
        return NO * NO == num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        

        int count = 0;
        for (int num : arr) {
            if (Perfect(num)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

