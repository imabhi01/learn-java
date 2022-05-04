import java.util.Arrays;

// An array is defined to be complete if the conditions (a), (d) and (e) below hold.
//  a. The array contains even numbers
//  b. Let min be the smallest even number in the array.
//  c. Let max be the largest even number in the array.
//  d. min does not equal max
//  e. All numbers between min and max are in the array
// For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because
//  a. The array contains even numbers
//  b. 2 is the smallest even number
//  c. 8 is the largest even number
//  d. 2 does not equal 8
//  e. the numbers 3, 4, 5, 6, 7 are in the array.
// Examples of arrays that are not complete are:
// {5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
// {2, 2} condition (d) does not hold
// {2, 6, 3, 4} condition (e) does not hold (5 is missing)

public class IsComplete {
    public static void main(String[] args){
        // System.out.println(checkIsComplete(new int[] {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        // System.out.println(checkIsComplete(new int[] {5, 7, 9, 13}));
        // System.out.println(checkIsComplete(new int[] {2, 6, 3, 4} ));
        // System.out.println(checkIsComplete(new int[] {2, 2} ));
        System.out.println(checkIsComplete(new int[] {2, 6, 3, 4}));
    }

    public static int checkIsComplete(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                if(arr[i] < min){
                    min = arr[i];
                }

                if(arr[i] > max){
                    max= arr[i];
                }
            }
        }

        for(int j = min+1; j < max; j++){
            
            boolean found = false;
            
            for(int k = 0; k < arr.length; k++){
                if(arr[k] == j){
                    found = true;
                    break;
                }
            }
            
            if(!found){
                return 0;
            }
        }

        if(min != max){
            return 1;
        }

        return 0;
    }
}
