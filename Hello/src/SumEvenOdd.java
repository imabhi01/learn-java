// Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and odd
// numbers in the array. Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers. The function should return X – Y

public class SumEvenOdd {
    public static void main(String[] args){
        System.out.println(sumEvenOdd(new int[] {1, 2}));
        System.out.println(sumEvenOdd(new int[] {1, 2, 3}));
    }

    public static int sumEvenOdd(int[] arr){

        int X = 0; // sum of odd
        int Y = 0; // sum of even

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                X += arr[i];
            }else{
                Y += arr[i];
            }
        }

        // System.out.println(X + " " + Y);
        return X-Y;
    }
}
