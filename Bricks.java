
import java.util.Scanner;

public class Bricks {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int totalBrickers = n*(3*n + 1)/ 2;
        System.out.println(totalBrickers);
    }
}
