import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        
        String primeNumbers = "";

        System.out.println("Enter n:");

        int n = scanner.nextInt();

        scanner.close();
        
        for(int i = 1; i <= n; i++){
            int counter = 0;
            for(num = i; num >= 1; num--){
                if(i % num == 0){
                    counter += 1;
                }                
            }

            if(counter == 2){
                primeNumbers = primeNumbers + i + "\n";
            }
        }

        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}

// Check if counter == 2 i.e., a number is divisible by 1 and itself (counts to two factors).