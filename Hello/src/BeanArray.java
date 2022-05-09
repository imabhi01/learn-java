import org.omg.CORBA.SystemException;

// An array is defined to be a Bean array if it meets the following conditions
//  a. If it contains a 9 then it also contains a 13.
//  b. If it contains a 7 then it does not contain a 16.
// So {1, 2, 3, 9, 6, 13} and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are
// Bean arrays. The following arrays are not Bean arrays:
//  a. { 9, 6, 18} (contains a 9 but no 13)
//  b. {4, 7, 16} (contains both a 7 and a 16)
// Write a function named isBean that returns 1 if its array argument is a Bean array, otherwise it returns
// 0.
// If you are programming in Java or C#, the function signature is
//  int isBean (int[ ] a)
// If you are programming in C or C++, the function signature is
//  int isBean (int a[ ], int len) where len is the number of elements in the array.

public class BeanArray {
    public static void main(String[] args){
        System.out.println(isBean(new int[] {1,2,3,9,6,13})); // true
        System.out.println(isBean(new int[] {9, 6, 18})); // false
        System.out.println(isBean(new int[] {4, 7, 16})); // false
        System.out.println(isBean(new int[] {3, 4, 6, 7, 13, 15})); // true
        System.out.println(isBean(new int[] {1, 2, 3, 4, 10, 11, 12})); // true
    }

    public static int isBean(int[] arr){
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 9 || arr[i] == 7){
                if(checkNext(arr[i], arr) != true){
                    return 0;
                }
            }
        }

        return 1;

    }

    public static boolean checkNext(int n, int[] arr2){
        
        boolean flag = true;

        if(n == 9){
            for(int i = 0; i < arr2.length; i++){
                if(arr2[i] == 13){
                    flag = true;
                }else{
                    flag = false;
                }
            }
        }

        if(n == 7){
            for(int i = 0; i < arr2.length; i++){
                if(arr2[i] != 16){
                    flag = true;
                }else{
                    flag = false;
                }
            }
        }


        return flag;
    }
}
