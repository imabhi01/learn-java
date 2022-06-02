// Write a function to return an array containing all elements common to two given arrays containing distinct positive integers. You should not use any inbuilt methods. You are allowed to use any number of arrays.
// The signature of the function is:
// int[] f(int[] first, int[] second)

import java.util.Arrays;

public class CommonIntegers {
    public static void main(String[] args){
        System.out.println(common(new int[]{1,2,3,4,5}, new int[]{2, 4, 6, 8}));
        System.out.println(common(null, null));
        System.out.println(common(null, {}));
    }

    public static java.lang.Integer common(int[] arr1, int[] arr2){

        if(arr1 == null || arr2 == null) return null;

        // if(arr1.length == 0 || arr2.length == 0) return new int[0];
        
        int[] common = new int[arr1.length];
        
        int k = 0;

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    common[k] = arr1[i];
                    k++;
                }
            }
        }

        int[] newCommonArr = new int[k];
        
        // formating arrays and removing null or 0 values from inside the array 
        for(int l = 0; l < k; l++){
            newCommonArr[l] = common[l];
        }

        System.out.println(Arrays.toString(newCommonArr));
        return 1;
    }
}
