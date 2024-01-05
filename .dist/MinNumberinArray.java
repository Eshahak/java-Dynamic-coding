import java.util.*;

public class MinNumberinArray {
    public static void MaxInArray(int arr[], int length){
        int min =arr[0], index=0;
        for(int i =0; i<length; i++){
            if(arr[i]<min)
                min = arr[i];
                index = i;
        }
        System.out.println(min);
        System.out.println(index);
    }
public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        MaxInArray (arr, arr.length); 
}
}
