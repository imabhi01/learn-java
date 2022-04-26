import java.util.Arrays;

public class LargestPrimeFactor {
    public static void main(String[] args){
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(50));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }

    public static int largestPrimeFactor(int n){
        
        int max = 0;

        for(int i = 2; i <= n; i++){ // loop starting from 2 to until n (1 is not needed as it is a factor of all number)
            while(n % i == 0){
                n = n/i;
                if(i > max){
                    max = i;
                }
            }
        }

        return max;
    }
}
