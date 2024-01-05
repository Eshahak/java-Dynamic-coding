 import java.util.*;

public class MinPenalty {
     public static int calculateMinimumPenalty(int[] array) {
        Arrays.sort(array); // Sort the array
        
        int minimumPenalty = 0;
        
        for (int i = 1; i < array.length; i++) {
            minimumPenalty += Math.abs(array[i] - array[i - 1]);
        }
        return minimumPenalty;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        System.out.println("Enter the array of integers:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Calculate and print the minimum penalty
        int minimumPenalty = calculateMinimumPenalty(array);
        System.out.println("Minimum Penalty: " + minimumPenalty);
    }
}
