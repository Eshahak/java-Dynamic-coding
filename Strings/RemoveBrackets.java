import java.util.Scanner;
import java.util.*;
public class RemoveBrackets {
    public static String remove(String str){
        StringBuilder sr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '(' && str.charAt(i) != ')'){
                sr.append(str.charAt(i));
            }
        }
        return sr.toString();        
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the algebraic equation");
    String input = sc.nextLine();
    String output = remove(input);
    System.out.println(output);
}    
}
