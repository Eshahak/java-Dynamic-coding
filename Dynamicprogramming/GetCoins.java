package Dynamicprogramming;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GetCoins{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target value N: ");
        int N = scanner.nextInt();

        ArrayList<Integer> denominations = new ArrayList<>();
        Collections.addAll(denominations, 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

        ArrayList<Integer> result = getMinimumCoins(N, denominations);

        System.out.println("Minimum number of coins and notes needed:");
        for (int coin : result) {
            System.out.print(coin + " ");
        }
    }

    public static ArrayList<Integer> getMinimumCoins(int N, ArrayList<Integer> denominations) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        while (N > 0 && i < denominations.size()) {
            int currentDenomination = denominations.get(i);
            if (N >= currentDenomination) {
                int numNotes = N / currentDenomination;
                for (int j = 0; j < numNotes; j++) {
                    result.add(currentDenomination);
                }
                N = N % currentDenomination;
            }
            i++;
        }
        return result;
    }
}

