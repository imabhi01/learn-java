// An array is defined to be a Nice array if the sum of the primes in the array is equal to the first
// element of the array. If there are no primes in the array, the first element must be 0. So {21, 3, 7, 9,
// 11 4, 6} is a Nice array because 3, 7, 11 are the primes in the array and they sum to 21 which is the
// first element of the array. {13, 4, 4,4, 4} is also a Nice array because the sum of the primes is 13
// which is also the first element. Other Nice arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}. {8, 5, -5, 5, 3} is
// not a Nice array because the sum of the primes is 5+5+3 = 13 but the first element of the array is 8.
// Note that -5 is not a prime because prime numbers are positive.
// Write a function named isNiceArray that returns 1 if its integer array argument is a Nice array.
// Otherwise it returns 0.
// The function signature is
//  int isNiceArray (int[ ] a)
// You may assume that a function named isPrime exists that returns 1 if its int argument is a prime,
// otherwise it returns 0. You do **not** have to write this function! You just have to call it.

public class Nice {
    public static void main(String[] args){
        System.out.println(nice(new int[] {21, 3, 7, 9,11, 4, 6}));
        System.out.println(nice(new int[] {13, 4, 4,4, 4}));
        System.out.println(nice(new int[] {0, 6, 8, 20}));
        System.out.println(nice(new int[] {3}));
        System.out.println(nice(new int[] {8, 5, -5, 5, 3} ));
    }

    public static int nice(int[] arr){
        int primeSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i]) == 1){
                primeSum += arr[i];
            }
        }

        if(primeSum == arr[0]){
            return 1;
        }

        return 0;
    }

    public static int isPrime(int n){
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }

        return count == 2 ? 1: 0;
    }
}
