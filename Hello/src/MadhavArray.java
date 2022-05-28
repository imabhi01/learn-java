// A Madhav array has the following property.
//  a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
// The length of a Madhav array must be n*(n+1)/2 for some n.
// Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,
// otherwise it returns 0. If you are programming in Java or C# the function signature is
//  int isMadhavArray(int[ ] a)
// If you are programming in C or C++, the function signature is
//  int isMadhavArray(int a[ ], int len) where len is the number of elements in a.


public class MadhavArray {
    public static void main(String[] args){
        // System.out.println(madhav(new int[] {2, 1, 1}));
        System.out.println(madhav(new int[] {2, 1, 1, 4, -1, -1}));
        // System.out.println(madhav(new int[] {6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
    }

    public static int madhav(int[] arr){

        System.out.println(025/5); System.exit(-1);

        int i, k, j, sum, position = 0;

        int len = arr.length;

        int initial = arr[0];

        if(len < 3){
            return 0;
        }

        for(i = 2; ; i++){
            sum = i * (i + 1) / 2;
            if(sum == len) break;
            if(sum > len) return 0;
        }

        position = i;

        System.out.println(position);
        
        for(i = 1, k = 1; i < position; i++) {
            
            sum = 0;
            
            for(j = 0; j <= i+1; j++){
                sum += arr[k++];
            }

            if(sum != initial) return 0;

        }

        return 1;

    }
}
