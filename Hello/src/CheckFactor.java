import java.util.Arrays;
import java.util.Scanner;

public class CheckFactor {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input m and n!");

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        scanner.close();

        int j = 0;
        int k = 0;

        int[] mfactor = new int[m];
        
        for(int i = 1; i <= m; i++){
            if(m % i == 0){
                mfactor[j] = i;
            }
            j++;
        }
    
        int[] nfactor = new int[n];
        
        for(int i = 1; i <= n; i++){
            if(m % i == 0){
                nfactor[k] = i;
            }
            k++;
        }

        System.out.println(Arrays.toString(mfactor));
        System.out.println(Arrays.toString(nfactor));

    }
}
