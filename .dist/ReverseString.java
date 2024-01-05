
import java.util.Scanner;
    public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]);
            if (i > 0) {
                output.append(" ");
            }
        }
        
        System.out.println("Output: " + output.toString());
    }
}

    

