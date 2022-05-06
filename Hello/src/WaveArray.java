// A wave array is defined to an array which does not contain two even numbers or two odd
// numbers in adjacent locations. So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave
// arrays. But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each
// other.
// Write a function named isWave that returns 1 if its array argument is a Wave array, otherwise it
// returns 0.
// If you are programming in Java or C#, the function signature is
//  int isWave (int [ ] a)
// If you are programming in C or C++, the function signature is
//  int isWave (int a[ ], int len) where len is the number of elements in the array.

public class WaveArray {
    public static void main(String[] args){
        System.out.println(wavearray(new int[] {7, 2, 9, 10, 5}));
        System.out.println(wavearray(new int[] {4, 11, 12, 1, 6}));
        System.out.println(wavearray(new int[] {1, 0, 5}));
        System.out.println(wavearray(new int[] {2}));
        System.out.println(wavearray(new int[] {2, 6, 3, 4}));
    }

    public static int wavearray(int[] arr){
        
        // boolean flag = false;

        // if(arr.length == 1){
        //     return 1;
        // }

        // // Logic: Numbers in array should be in odd and even order chain without breaking.

        // for(int i = 0; i < arr.length; i++){
        //     if(i < arr.length - 1){
        //         if(arr[i] % 2 == 0){
        //             if(arr[i+1] % 2 != 0){
        //                 flag = true;
        //             }
        //             break;
        //         }else{
        //             if(arr[i+1] % 2 == 0){
        //                 flag = true;
        //             }
        //             break;
        //         }
        //     }
        // }

        // return flag == true ? 1 : 0;

        // Short method

        for(int i = 0; i < arr.length -1; i++){
            if((arr[i] % 2 == 0) == (arr[i+1] % 2 == 0)){
                return 0;
            }
        }

        return 1;
    }
}
