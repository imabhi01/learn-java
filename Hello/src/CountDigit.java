// Write a function named countDigit that returns the number of times that a given digit appears in a
// positive number. For example countDigit(32121, 1) would return 2 because there are two 1s in 32121.
// Other examples:
// countDigit(33331, 3) returns 4
// countDigit(33331, 6) returns 0
// countDigit(3, 3) returns 1
// The function should return -1 if either argument is negative, so
// countDigit(-543, 3) returns -1.
// The function signature is
// int countDigit(int n, int digit)
// Hint: Use modulo base 10 and integer arithmetic to isolate the digits of the number

public class CountDigit {
    public static void main(String[] args){
        System.out.println(countDigit(333221, 3));
        System.out.println(countDigit(4321, 2));
        System.out.println(countDigit(4321, 2));
        System.out.println(countDigit(-543, 3));
    }

    public static int countDigit(int n, int k){
        
        int count = 0;
        int rem;

        while(n != 0){
            
            rem = n % 10;
            
            if(n > 0){
                if(rem == k){
                    count++;
                }
            }

            if(n < 0){
                if(((rem < 0) ? -rem : 0) == k){
                    count--;
                }
            }
            
            n = n / 10;
        }

        return count;
    }
}
