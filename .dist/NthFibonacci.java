import java.util.*;
/* 0 1 1 2 3 5 8 13 21 34 55 fibonacci series */
public class NthFibonacci{

public static int  fibnacciPostion(int input){           

        if(input==1){
            return 1;
        }else if(input == 2){
            return 1;
        }else if(input ==3){
            return 2;
        }else{
            return fibnacciPostion(input -1) + fibnacciPostion(input -2);
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int input = sc.nextInt();
    int result = fibnacciPostion(input);
    System.out.println(result);
}
    
}
