package Dynamicprogramming;
import java.util.Scanner;

public class MinimmumOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int N = sc.nextInt();
        
        int result = minOperations(N);
        System.out.println(result);
    }

    public static int minOperations(int N) {
        if (N == 0) {
            return 0;
        }

        int[] dp = new int[N + 1];  //This part of the line declares an integer array named dp. Arrays are used to store a collection of values of the same data type. In this case, we are creating an array to store intermediate results for dynamic programming

        for (int i = 1; i <= N; i++) {
            dp[i] = dp[i - 1] + 1; // Adding 1 to i
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // Doubling i
            }
        }
        return dp[N];
    }
}

    

