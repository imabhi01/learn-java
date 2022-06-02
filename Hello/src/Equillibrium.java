// Consider an array A with n of positive integers. An integer idx is called a POE (point of equilibrium) of A, if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1]. Write a function to return POE of an array, if it exists and -1 otherwise. 
// The signature of the function is:
// int f(int[] a)

// if input arrays are	return
// {1, 8, 3, 7, 10, 2}	3 Reason: a[0] + a[1] + a[2] is equal to a[4] + a[5]
// {1, 5, 3, 1, 1, 1, 1, 1, 1}	2 Reason: a[0] + a[1] is equal to a[3] + a[4] + a[5] + a[6] + a[7] + a[8]
// {2, 1, 1, 1, 2, 1, 7}	5 Reason: a[0] + a[1] + a[2] + a[3] + a[4] is equal to a[6]
// {1, 2, 3}	-1 Reason: No POE.
// {3, 4, 5, 10}	-1 Reason: No POE.
// {1, 2, 10, 3, 4}	-1 Reason: No POE.

public class Equillibrium {
    public static void main(String[] args){
        // System.out.println(equillibrium(new int[]{1, 8, 3, 7, 10, 2}));
        // System.out.println(equillibrium(new int[]{1, 2, 3, 7, 10, 4}));
        System.out.println(equillibrium(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
        // System.out.println(equillibrium(new int[]{2, 1, 1, 1, 2, 1, 7}));
    }

    public static int equillibrium(int[] arr){

        int leftSum = arr[0];
        int rightSum = arr[arr.length-1];
        int count = 1; // count how many elements fullfill the requirements (reasons required)
        int i = 0;

        int j = arr.length - 1;

        for(int k = 1; k < arr.length-2; k++){

            if(leftSum < rightSum){
                i++;
                leftSum += arr[i];
                count = i+1;
            }else{
                j--;
                rightSum += arr[j];
                count = i-1;
            }

        }

        if(leftSum == rightSum){
            return count;
        }
        
        return -1;
    }
}
