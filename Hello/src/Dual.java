// Define a Dual array to be an array where every value occurs exactly twice.
// For example, {1, 2, 1, 3, 3, 2} is a dual array.
// The following arrays are not Dual arrays
// {2, 5, 2, 5, 5} (5 occurs three times instead of two times)
// {3, 1, 1, 2, 2} (3 occurs once instead of two times)
// Write a function named isDual that returns 1 if its array argument is a Dual array. Otherwise it returns
// 0.
// If you are programming in Java or C#, the function signature is
//  int isDual (int[ ] a)
// If you are programming in C or C++, the function signature is
//  int isDual (int a[ ], int len) where len is the number of elements in the array.

public class Dual {
    public static void main(String[] args){
        System.out.println(dual(new int[]{1, 2, 1, 3, 3, 2}));
        System.out.println(dual(new int[]{2, 5, 2, 5, 5}));
        System.out.println(dual(new int[]{3, 1, 1, 2, 2}));
    }

    public static int dual(int[] arr){
        boolean isdual = false;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == num){
                    count++;
                }
            }
            // System.out.println("For " + arr[i] + " count "+ count);
            if(count == 2){
                isdual = true;
            }else{
                isdual = false;
                break;
            }
        }
        return isdual == true ? 1 : 0;
    }
}
