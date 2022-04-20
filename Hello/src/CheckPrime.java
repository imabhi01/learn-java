import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        
        int flag = 0;

        if(number == 0 || number == 1){
            flag = 1;
        }

        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

        return;
    }
}
