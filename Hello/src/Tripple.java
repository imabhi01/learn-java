// Define a Triple array to be an array where every value occurs exactly three times.
// For example, {3, 1, 2, 1, 3, 1, 3, 2, 2} is a Triple array.
// The following arrays are not Triple arrays
// {2, 5, 2, 5, 5, 2, 5} (5 occurs four times instead of three times)
// {3, 1, 1, 1} (3 occurs once instead of three times)
// Write a function named isTriple that returns 1 if its array argument is a Triple array. Otherwise it returns 0.
// If you are programming in Java or C#, the function signature is
//  int isTriple (int[ ] a)
// If you are programming in C or C++, the function signature is
//  int isTriple (int a[ ], int len) where len is the number of elements in the array.

public class Tripple {
    public static void main(String[] args){
        System.out.println(tripple(new int[] {3, 1, 2, 1, 3, 1, 3, 2, 2}));
        System.out.println(tripple(new int[] {2, 5, 2, 5, 5, 2, 5}));
        System.out.println(tripple(new int[] {3, 1, 1, 1}));
    }   

    public static int tripple(int[] arr){
        
        boolean isTriple = true;

        for(int i = 0; i < arr.length ; i++){
            int num = arr[i];
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(num == arr[j]){
                    count++;
                }
            }

            if(count != 3){
                isTriple = false;
                break;
            }
           
        }
        
        return isTriple == true ? 1 : 0;
    }
}
