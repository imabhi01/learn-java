// An array is said to be dual if it has an even number of elements and each pair of consecutive even and odd elements
// sum to the same value. Write a function named isDual that accepts an array of integers and returns 1 if the array is dual, otherwise it
// returns 0. Examples: {1, 2, 3, 0} is a dual array (because 1+2 = 3+0 = 3), {1, 2, 2, 1, 3, 0} is a dual array (because 1+2 = 2+1 = 3+0 = 3),
// {1, 1, 2, 2}</td> is not a dual array (because 1+1 is not equal to 2+2), {1, 2, 1}</td> <td> is not a dual array (because array does not
// have an even number of elements), {} is a dual array.
// If you are programming in Java or C#, the function signature is
// int isDual(int[ ] a)
// If you are programming in C or C++, the function signature is
// int isDual(int a[ ], int len)
// where len is the number of elements in the array

import java.util.Arrays;

public class DualArray {
    public static void main(String[] args){
        System.out.println(dual(new int[]{1, 2, 3, 0}));
        System.out.println(dual(new int[]{1, 2, 2, 1, 3, 0}));
        System.out.println(dual(new int[]{1, 2, 1}));
        System.out.println(dual(new int[]{1, 1, 2, 2}));
    }

    public static int dual(int[] arr){
        
        int[] sum = new int[arr.length/2];

        boolean isdual = false;
        
        if(arr.length % 2 == 0){
            int j = 0;
            for(int i = 0; i < arr.length; i++){
                if(i % 2 == 0){
                    sum[j] = arr[i] + arr[i+1];
                    j++;
                }
            }

            for(int k = 0; k < sum.length-1; k++){
                if(sum[k] == sum[k+1]){
                    isdual = true;
                }
            }
        }else{
            return 0;
        }


        
        return isdual == true ? 1 : 0;
    }
}
