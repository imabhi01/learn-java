// Consider the prime number 11. Note that 13 is also a prime and 13 – 11 = 2. So, 11 and 13 are
// known as twin primes. Similarly, 29 and 31 are twin primes. So is 71 and 73. However, there are
// many primes for which there is no twin. Examples are 23, 67. A twin array is defined to an array
// which every prime that has a twin appear with a twin. Some examples are
// {3, 5, 8, 10, 27}, // 3 and 5 are twins and both are present
// {11, 9, 12, 13, 23}, // 11 and 13 are twins and both are present, 23 has no twin
// {5, 3, 14, 7, 18, 67}. // 3 and 5 are twins, 5 and 7 are twins, 67 has no twin
// The following are NOT twin arrays:
// {13, 14, 15, 3, 5} // 13 has a twin prime and it is missing in the array
// {1, 17, 8, 25, 67} // 17 has a twin prime and it is missing in the array
// Write a function named isTwin(int[ ] arr) that returns 1 if its array argument is a Twin array, otherwise
// it returns 0.

public class TwinArray {
    public static void main(String[] args){
        System.out.println(isTwinArray(new int []{3,5,8,10,27}));
        System.out.println(isTwinArray(new int []{11, 9, 12, 13, 23}));
        System.out.println(isTwinArray(new int []{13, 14, 15, 3, 5}));
        System.out.println(isTwinArray(new int []{1, 17, 8, 25, 67}));
    }

    public static int isTwinArray(int arr[]){

        boolean isTwinArray = false;
        
        for(int i = 0; i < arr.length; i++){
            
            if(isPrime(arr[i]) == 1){
                
                int primeOne = arr[i];
                
                for(int j = i+1; j < arr.length; j++){ // j = i+1 check other indexes of array other than i (i.e, when i is 3 in the first passed array, it checks for 5,8,10,27 values in the array.)
                    
                    if(isPrime(arr[j]) == 1){
                        
                        int primeTwo = arr[j];

                        if(Math.abs(primeOne - primeTwo) == 2){ // if used Math.abs
                            isTwinArray = true;
                        }
                         
                        // if(primeOne > primeTwo){ // If Math.abs is not used
                        //     if(primeOne - primeTwo == 2){
                        //         isTwinArray = true;
                        //     }
                        // }

                        // if(primeTwo - primeOne == 2){
                        //     isTwinArray = true;
                        // }

                    }
                }

                if(!isTwinArray){
                    break;
                }
            }
        }

        // System.out.println(isTwinArray);
        
        return (isTwinArray == true) ? 1 : 0;
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
