import java.util.Scanner;

public class RemoveSpace {
    
    public static String removeSpaces(String str) {
      // Use the replaceAll method with a regular expression to remove spaces
        String result = str.replaceAll("\\s+","");
        return result;
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = removeSpaces(input);
        
        System.out.println(result);
        
    }
}
