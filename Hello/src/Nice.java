public class Nice {
    public static void main(String[] args){
        System.out.println(nice(new int[] {21, 3, 7, 9,11, 4, 6}));
        System.out.println(nice(new int[] {13, 4, 4,4, 4}));
        System.out.println(nice(new int[] {0, 6, 8, 20}));
        System.out.println(nice(new int[] {3}));
        System.out.println(nice(new int[] {8, 5, -5, 5, 3} ));
    }

    public static int nice(int[] arr){
        int primeSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i]) == 1){
                primeSum += arr[i];
            }
        }

        if(primeSum == arr[0]){
            return 1;
        }

        return 0;
    }

    public static int isPrime(int n){
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }

        return count == 2 ? 1: 0;
    }
}
