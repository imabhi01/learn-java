// An array is said to be hollow if it contains 3 or more zeroes in the middle that are preceded and
// followed by the same number of non-zero elements. Write a function named isHollow that accepts an
// integer array and returns 1 if it is a hollow array, otherwise it returns 0
// Examples: isHollow({1,2,4,0,0,0,3,4,5}) returns 1. isHollow ({1,2,0,0,0,3,4,5}) returns 0. isHollow
// ({1,2,4,9, 0,0,0,3,4, 5}) returns 0. isHollow ({1,2, 0,0, 3,4}) returns 0.
// If you are programming in Java or C#, the function signature is
// int isHollow(int[ ] a).
// If you are C or C++ programmer
// int isHollow(int[ ] a, int len)
// where len is the number of elements in the array. 

public class hollow {
    public static void main(String[] args){
        System.out.println(hollowFunc(new int[] {1,2,4,0,0,0,3,4,5})); // true
        System.out.println(hollowFunc(new int[] {1,1,1,1,0,0,0,0,0,2,1,2,18})); // true
        System.out.println(hollowFunc(new int[] {1,2,0,4,6,3,4,5})); // false
        System.out.println(hollowFunc(new int[] {0, 0, 0})); // true
        System.out.println(hollowFunc(new int[] {1, 2, 0, 0, 3, 4})); // false
        System.out.println(hollowFunc(new int[] {1, 2, 0, 0, 3, 4})); // false
        System.out.println(hollowFunc(new int[] {1,2,0,0,0,3,4,5})); // false
        System.out.println(hollowFunc(new int[] {3,8,3,0,0,0,3,3})); // false
    }

    public static int hollowFunc(int[] arr){
        int mid = arr.length / 2;
        int preNonZeros = 0;
        int followingNonZeros = 0;
        int zeroCount = 0;
        boolean flag = false;

        for(int i = 0; i < arr.length ; i++){
            
            if(i < mid){
                if(arr[i] != 0){
                    preNonZeros++;
                }
            }

            if(i > mid){
                if(arr[i] != 0){
                    followingNonZeros++;
                }
            }

            if(arr[i] == 0){
                if(arr[mid+1] != 0 || arr[mid-1] != 0){
                    flag = false;
                }
                zeroCount++;
            }

        }

        if(preNonZeros == followingNonZeros){
            if(zeroCount >= 3 && zeroCount >= preNonZeros && zeroCount >= followingNonZeros){
                flag = true;
            }
        }

        // System.out.println(" ZeroCount " + zeroCount);
        // System.out.println(" preNonZeros " + preNonZeros);
        // System.out.println(" followingNonZeros " + followingNonZeros);
        // System.out.println(flag);

        return flag == true ? 1 : 0;
        
    }
}
