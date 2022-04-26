import java.util.Scanner;

public class Loops{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int queries = input.nextInt();
        
        for(int i = 0; i < queries; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            
            int c = a;
            
            for(int j=0; j < n; j++){
                c += Math.pow(2, j) * b;
                System.out.println(c);
            }
        }

        input.close();

    }
}