import java.util.Scanner;

public class CountVowelsConsonetsWhitespace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert the input to lowercase for case insensitivity

        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (ch == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("White spaces: " + spaceCount);

        scanner.close();
    }
}
