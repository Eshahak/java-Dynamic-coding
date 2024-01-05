import java.util.*;

public class MaxNumberinArray {
    public static void MaxInArray(int arr[], int length){
        int max =0, index=0;
        for(int i =1; i<length; i++){
            if(arr[i]>max)
                max= arr[i];
                index = i;
        }
        System.out.println(max);
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


