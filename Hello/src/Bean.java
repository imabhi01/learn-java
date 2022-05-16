// A Bean array is defined to be an integer array where for every value n in the array, there is also an element 2n, 2n+1
// or n/2 in the array.
// For example, {4, 9, 8} is a Bean array because
// For 4, 8 is present; for 9, 4 is present; for 8, 4 is present.
// Other Bean arrays include {2, 2, 5, 11, 23}, {7, 7, 3, 6} and {0}.
// The array {3, 8, 4} is not a Bean array because of the value 3 which requires that the array contains either the value 6, 7
// or 1 and none of these values are in the array.
// Write a function named isBean that returns 1 if its array argument is a Bean array. Otherwise it returns a 0.
// If you are programming in Java or C#, the function signature is
//  int isBean(int[ ] a)
// If you are programming in C or C++, the function signature is
//  int isBean(int a[ ], int len) where len is the number of elements in the array.

public class Bean {
    public static void main(String[] args){
        System.out.println(bean(new int[] {4, 9, 8}));
        System.out.println(bean(new int[] {2, 2, 5, 11, 23}));
        System.out.println(bean(new int[] {7, 7, 3, 6}));
        System.out.println(bean(new int[] {0}));
        System.out.println(bean(new int[] {3, 8, 4}));
        System.out.println(bean(new int[] {2, 8, 3, 12}));
    }    

    public static int bean(int[] arr){
        
        boolean isBean = false;

        for(int i = 0; i < arr.length; i++){
            
            int num = arr[i];

            for(int j = 0; j < arr.length; j++){
                if(arr[j] == num / 2 || arr[j] == 2*num || arr[j] == (2*num + 1)){
                    isBean = true;
                }
            }

            if(isBean == false){
                return 0;
            }
        }

        return isBean == true ? 1 : 0;
    }
}
