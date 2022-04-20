import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        scanner.close();
        for(int i=1; i<=n; i++){
            System.out.println(i);   
        }
    }
}
