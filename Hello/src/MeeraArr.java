// Define a Meera array to be an array a if it satisfies two conditions:
// (a) a[i] is less than i for i = 0 to a.length-1.
// (b) sum of all elements of a is 0.
// For example, {-4, 0, 1, 0, 2, 1} is a Meera array because
// -4 = a[0] < 0
// 0 = a[1] < 1
// 1 = a[2] < 2
// 0 = a[3] < 3
// 2 = a[4] < 4
// 1 = a[5] < 5
// and -4 + 0 + 1 + 0 + 2 + 1 = 0
// {-8, 0, 0, 8, 0} is not a Meera array because a[3] is 8 which is not less than 3. Thus condition (a) fails. {-8, 0, 0, 2, 0} is not
// a Meera array because -8 + 2 = -6 not equal to zero. Thus condition (b) fails.
// Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise it returns 0.
// If you are programming in Java or C#, the function signature is
//  int isMeera (int[ ] a)
// If you are programming in C or C++, the function signature is
//  int isMeera (int a[ ], int len) where len is the number of elements in the array.

public class MeeraArr {
    public static void main(String[] args){
        System.out.println(meeraArr(new int[] {-4, 0, 1, 0, 2, 1}));
        System.out.println(meeraArr(new int[] {-8, 0, 0, 8, 0}));
    }

    public static int meeraArr(int[] arr){
        
        boolean isMeeraArray = false;

        int sum = 0;

        boolean sumCondition = false;

        for(int i = 0; i < arr.length; i++){

            sum += arr[i];
            
            if(arr[i] > i){
                isMeeraArray = false;
                break;
            }

            isMeeraArray = true;
        }

        if(sum == 0){
            sumCondition = true;
        }

        System.out.println(sumCondition + " " + isMeeraArray);

        return (isMeeraArray == true && sumCondition == true) ? 1 : 0;
    }

}
