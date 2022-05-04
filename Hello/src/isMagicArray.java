// 2. An array is defined to be a Magic array if the sum of the primes in the array is equal to the first
// element of the array. If there are no primes in the array, the first element must be 0. So {21, 3, 7, 9,
// 11 4, 6} is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21 which is the
// first element of the array. {13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13
// which is also the first element. Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}. {8, 5, -5, 5, 3} is
// not a Magic array because the sum of the primes is 5+5+3 = 13. Note that -5 is not a prime because
// prime numbers are positive.
// Write a function named isMagicArray that returns 1 if its integer array argument is a Magic array.
// Otherwise it returns 0.
// If you are writing in Java or C#, the function signature is
//  int isMagicArray (int[ ] a)
// If you are writing in C or C++, the function signature is
//  int isMagicArray (int a[ ], int len) where len is the number of elements in the array.
// You may assume that a function named isPrime exists that returns 1 if its int argument is a prime,
// otherwise it returns 0. You do not have to write this function! You are allowed to use it.

import java.util.Arrays;

public class isMagicArray {
    public static void main(String[] args){
        System.out.println(checkMagicArray(new int[] {7, 4, 2, 5}));
        System.out.println(checkMagicArray(new int[] {21, 3, 7, 9, 11, 4, 6}));
        System.out.println(checkMagicArray(new int[] {0, 6, 8, 20}));
        System.out.println(checkMagicArray(new int[] {8, 5, -5, 5, 3}));
    }

    private static int checkMagicArray(int[] arr){
        int primeSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(checkPrimeOrNot(arr[i]) == 1){
                primeSum = primeSum + arr[i];
            }
        }

        if(primeSum == arr[0]){
            return 1;
        }
        
        return 0;
    }

    private static int checkPrimeOrNot(int n){

        int count = 0;
        
        for(int i = 1; i <= n; i++){

            if(n % i == 0){
                count++;
            }

        }

        //Check if the number is divisible by 1 and by itself that counts to 2 in total

        if(count == 2){
            return 1;
        }

        return 0;
    }
}
