import java.util.Scanner;

public class BulbSwitcher {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        BulbSwitcher solution = new BulbSwitcher();
        int result = solution.bulbSwitch(n);
        System.out.println("The number of bulbs that are on after " + n + " rounds is: " + result);
    }
}
