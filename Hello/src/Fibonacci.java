// A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,…. Note that first two Fibonacci numbers are
// 1 and any Fibonacci number other than the first two is the sum of the previous two Fibonacci numbers. For example, 2 = 1
// + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.
// Write a function named isFibonacci that returns 1 if its integer argument is a Fibonacci number, otherwise it returns 0.
// The signature of the function is
//  int isFibonacci (int n)

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println(fibonacci(8));
    }

    public static int fibonacci(int n){
        int[] arr = new int[n+2];
        int first = 1;
        int second = 1;
        arr[0] = first;
        arr[1] = second;
        for(int i = 2; i <= n; i++){
            arr[i] = first + second;
            second = first;
            first = i;
        }

        for(int j = 0; j < arr.length ; j++){
            if(n == arr[j]){
                return 1;
            }
        }

        return 0;
    
    }
}
