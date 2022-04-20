import java.util.Scanner;

public class inputs {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        s = scan.nextLine();
        scan.close();
        
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);

    }
}
