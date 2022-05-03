import java.util.Arrays;

public class isMagicArray {
    public static void main(String[] args){
        System.out.println(checkMagicArray(new int[] {7, 4, 2, 5}));
        System.out.println(checkMagicArray(new int[] {21, 3, 7, 9, 11, 4, 6}));
        System.out.println(checkMagicArray(new int[] {0, 6, 8, 20}));
        System.out.println(checkMagicArray(new int[] {8, 5, -5, 5, 3}));
    }

    private static int checkMagicArray(int[] arr){
        int primeSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(checkPrimeOrNot(arr[i]) == 1){
                primeSum = primeSum + arr[i];
            }
        }

        if(primeSum == arr[0]){
            return 1;
        }
        
        return 0;
    }

    private static int checkPrimeOrNot(int n){

        int count = 0;
        
        for(int i = 1; i <= n; i++){

            if(n % i == 0){
                count++;
            }

        }

        //Check if the number is divisible by 1 and by itself that counts to 2 in total

        if(count == 2){
            return 1;
        }

        return 0;
    }
}
