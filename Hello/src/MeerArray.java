// A Meera array is an array that contains the value 1 if and only if it contains 9. The array {7, 9, 0, 10, 1} is a Meera array
// because it contains 1 and 9. The array {6, 10, 8} is a Meera array because it contains no 1 and also contains no 9.
// The array {7, 6, 1} is not a Meera array because it contains 1 but does not contain a 9. The array {9, 10, 0} is not a Meera
// array because it contains a 9 but does not contain 1.
// It is okay if a Meera array contains more than one value 1 and more than one 9, so the array {1, 1, 0, 8, 0, 9, 9, 1} is a
// Meera array.
// Write a function named isMeera that returns 1 if its array argument is a Meera array and returns 0 otherwise.
// If you are programming in Java or C#, the function signature is
//  int isMeera(int [ ] a)
// If you are are programming in C or C++, the function signature is
//  int isMeera(int a[ ], int len) where len is the number of elements in the array

public class MeerArray {
    public static void main(String[] args){
        System.out.println(merrArr(new int[] {7, 9, 0, 10, 1}));
        System.out.println(merrArr(new int[] {6, 10, 8}));
        System.out.println(merrArr(new int[] {6, 10, 8, 1}));
        System.out.println(merrArr(new int[] {7, 6, 1}));
    }

    public static int merrArr(int[] arr){
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            if(num == 1 || num == 9){
                for(int j = 0; j < arr.length; j++){
                    if((num == 1 && arr[j] != 9) || (num == 9 && arr[j] != 1)){
                        flag = false;
                    }else{
                        flag = true;
                        break;
                    }
                }
            }
        }
        return flag == true ? 1 : 0;
    }
}
