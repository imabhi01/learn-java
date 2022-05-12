
// 0 1 1 2 3 5 8 13 21 34

public class FibonacciSequence {

    static int n1 = 0, n2 = 1, n3 = 0;
    public static void main(String[] args){
        fibonacci(10);
    }

    static void fibonacci(int count){
        System.out.println(n1 + "\n" + n2);
        printFibonacci(count-2);  // previous 2 numbers are already printed so count - 2 for (8 numbers) excluding 0 and 1
    }

    static void printFibonacci(int n){
        if(n > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            printFibonacci(n - 1); // print sequence for next number 
        }
    }
}
