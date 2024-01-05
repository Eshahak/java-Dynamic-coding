import java.util.*;
import java.util.Scanner;
public class SearchAnElementInArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();

        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                ans = i;
                break;
            }  
        }
        System.out.print(ans);
    }
}
