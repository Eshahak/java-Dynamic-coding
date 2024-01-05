import java.util.*;
import java.util.Scanner;


public class SecondSmallestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }
        
Arrays.sort(arr);

int smallest = arr[1];
int largest = arr[arr.length-2];

System.out.println(smallest);
System.out.println(largest);
      
}
}




    

