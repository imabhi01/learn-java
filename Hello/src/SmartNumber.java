// An integer is defined to be a Smart number if it is an element in the infinite sequence 1, 2, 4, 7, 11,
// 16 … Note that 2-1=1, 4-2=2, 7-4=3, 11-7=4, 16-11=5 so for k>1, the kth element of the sequence is
// equal to the k-1th element + k-1. For example, for k=6, 16 is the kth element and is equal to 11 (the k1th element) + 5 ( k-1).
// Write function named isSmart that returns 1 if its argument is a Smart number, otherwise it returns 0.
// So isSmart(11) returns 1, isSmart(22) returns 1 and isSmart(8) returns 0 .
// The function signature is
//  int isSmart(int n)

import java.util.Arrays;

public class SmartNumber {
    public static void main(String[] args) {
        System.out.println(isSmart(11));
        System.out.println(isSmart(22));
        System.out.println(isSmart(8));
    }

    public static int isSmart(int n) {

        int[] y = new int[n];
        int diff = 1;
        y[0] = 1;
        for(int i = 1; i < n; i++){
            y[i] = diff + y[i-1];
            diff++;
        }

        // System.out.println(Arrays.toString(y));

        for(int i = 0; i < y.length; i++){
            if(n == y[i]){
                return 1;
            }
        }
        
        return 0;
    }
}
