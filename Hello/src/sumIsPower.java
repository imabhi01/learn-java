// Write a function sumIsPower with signatuare
// boolean sumIsPower(int[] arr)
// which outputs true if the sum of the elements in the input array arr is a power of 2, false otherwise.
// Recall that the powers of 2 are 1, 2, 4, 8, 16, and so on. In general a number is a power of 2 if and
// only if it is of the form 2n
// for some nonnegative integer n. You may assume (without verifying in
// your code) that all elements in the array are positive integers. If the input array arr is null, the return
// value should be false.
// Examples: sumIsPower({8,8,8,8}) is true since 8 + 8 + 8 + 8 = 32 = 25
// . sumIsPower({8,8,8}) is
// false, since 8 + 8 +8 = 24, not a power of 2.

public class sumIsPower {
    public static void main(String[] args){
        System.out.println(sumispower(new int[] {8,8,8,8}));
    }

    public static int sumispower(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        for(int i = 1; i < sum / 2; i++){
            if(sum == Math.pow(2, i)){
                return 1;
            }
        }

        return 0;
    }
}
