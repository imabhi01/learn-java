// An array with an odd number of elements is said to be centered if all elements (except the middle
// one) are strictly greater than the value of the middle element. Note that only arrays with an odd
// number of elements have a middle element. Write a function named isCentered that accepts an
// integer array and returns 1 if it is a centered array, otherwise it returns 0.
// Examples: {5, 3, 3, 4, 5} is not a centered array (the middle element 3 is not strictly less than all other
// elements), {3, 2, 1, 4, 5} is centered (the middle element 1 is strictly less than all other elements), {3,
// 2, 1, 4, 1} is not centered (the middle element 1 is not strictly less than all other elements), {3, 2, 1, 1,
// 4, 6} is not centered (no middle element since array has even number of elements), {} is not centered
// (no middle element), {1} is centered (satisfies the condition vacuously).
// If you are programming in Java or C#, the function signature is
// int isCentered(int[ ] a)
// If you are programming in C or C++, the function signature is
// int isCentered(int a[ ], int len)
// where len is the number of elements in the array.
// There are three questions on this test. You have two hours to complete it. Please do your own work.
// You are not allowed to use any methods or functions provided by the system unless explicitly stated
// in the question. In particular, you are not allowed to convert int to a String or vice-versa.

public class CenteredArray {
    public static void main(String[] args){
        System.out.println(isCentered(new int[] {3,2,1,4,5}));
        System.out.println(isCentered(new int[] {5, 3, 3, 4, 5}));
        System.out.println(isCentered(new int[] {3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[] {3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[] {1}));
    }

    public static int isCentered(int[] arr){
        
        int mid = arr.length / 2;

        boolean flag = true;

        if(arr.length % 2 == 0){ // checking if array length is even
            flag = false;
            return 0;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(i != mid){
                if(arr[i] <= arr[mid]){
                    flag = false;
                    break;
                }
            }
        }

        return flag == true ? 1 : 0;
    }
}
