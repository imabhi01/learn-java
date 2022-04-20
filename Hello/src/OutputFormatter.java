import java.util.Scanner;

public class OutputFormatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x); // % is formatter, -15s is minimum 15 alphabets or strings allowed, 3d for 3 digit numbers or integers, 0 before 3d is if numbers less than 3 digit place 0 in front. %n new line.

            System.out.printf("%-5s%02d%n", s1, x); // + is not used throws errors
        }
        System.out.println("================================");
        sc.close();
    }
}
