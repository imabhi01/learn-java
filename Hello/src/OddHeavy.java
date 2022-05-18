// An array is defined to be odd-heavy if it contains at least one odd element and every odd element
// is greater than every even element. So {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11 and 9)
// are greater than all the even elements. And {11, 4, 9, 2, 3, 10} is not odd-heavy because the even element 10 is
// greater than the odd element 9. Write a function called isOddHeavy that accepts an integer array and returns
// 1 if the array is odd-heavy; otherwise it returns 0. Some other examples: {1} is odd-heavy, {2} is not oddheavy, {1, 1, 1, 1} is odd-heavy, {2, 4, 6, 8, 11} is odd-heavy, {-2, -4, -6, -8, -11} is not odd-heavy.
// If you are programming in Java or C#, the function signature is
// int isOddHeavy(int[ ] a)
// If you are programming in C or C++, the function signature is
// int isOddHeavy(int a[ ], int len)
// where len is the number of elements in the array.
// Question 3. A normal number is defined to be one that has no odd factors, except for 1 and possibly itself.
// Write a method named isNormal that returns 1 if its integer argument is normal, otherwise it returns 0. The
// function signature is
// int isNormal(int n)
// Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd factor. 10 is
// not a normal number since 5 is an odd factor.

public class OddHeavy {
    public static void main(String[] args){
        System.out.println(oddHeavy(new int[] {11, 4, 9, 2, 8}));
        System.out.println(oddHeavy(new int[] {1}));
        System.out.println(oddHeavy(new int[] {2}));
        System.out.println(oddHeavy(new int[] {1, 1, 1, 1}));
        System.out.println(oddHeavy(new int[] {2, 4, 6, 8, 11}));
        System.out.println(oddHeavy(new int[] {-2, -4, -6, -8, -11}));
    }

    public static int oddHeavy(int[] arr){
        boolean isoddHeavy = true;
        int oddCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                oddCount++;
                int oddNum = arr[i];
                for(int j = 0; j < arr.length; j++){
                    if(arr[j] % 2 == 0 && oddNum < arr[j]){
                        isoddHeavy = false;
                        break;
                    }
                }
            }
        } 

        if(oddCount < 1){
            return 0;
        }

        return (isoddHeavy == true) ? 1 : 0;
    }
}
