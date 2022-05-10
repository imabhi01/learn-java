// A Nice array is defined to be an array where for every value n in the array, there is also an
// element n-1 or n+1 in the array.
// For example, {2, 10, 9, 3} is a Nice array because
// 2 = 3-1
// 10 = 9+1
// 3 = 2 + 1
// 9 = 10 -1
// Other Nice arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
// The array {3, 4, 5, 7} is not a Nice array because of the value 7 which requires that the array contains
// either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.
// Write a function named isNice that returns 1 if its array argument is a Nice array. Otherwise it returns
// a 0.
// If you are programming in Java or C#, the function signature is
//  int isNice(int[ ] a)
// If you are programming in C or C++, the function signature is
//  int isNice(int a[ ], int len) where len is the number of elements in the array.

public class NiceArray {
    public static void main(String[] args){
        System.out.println(isNiceArray(new int[] {2, 10, 9, 3}));
        // System.out.println(isNiceArray(new int[] {2, 2, 3, 3, 3}));
        // System.out.println(isNiceArray(new int[] {1, 1, 1, 2, 1, 1}));
        System.out.println(isNiceArray(new int[] {3, 4, 5, 7}));
    }

    public static int isNiceArray(int[] arr){
        
        boolean isNiceArray;

        for(int i = 0 ; i < arr.length; i++){
            
            isNiceArray = false;

            int num = arr[i];

            for(int j = 0; j < arr.length; j++){
                
                if(i == j){
                    continue;
                }
                
                if((i+1) <= arr.length){
                    if( num+1 == arr[j] || num-1 == arr[j] ){
                        isNiceArray = true;
                        break;
                    }
                }
            }

            if(!isNiceArray){
                return 0;
            }
        }

        return 1;
    }

}
