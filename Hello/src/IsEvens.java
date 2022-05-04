// 1. An Evens number is an integer whose digits are all even. For example 2426 is an Evens number
// but 3224 is not.
// Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it
// returns 0.
// The function signature is
//  int isEvens (int n)


public class IsEvens{
    
    public static void main(String args[])
    {
        System.out.println(isEvens(2032));        
        System.out.println(isEvens(3224));        
        System.out.println(isEvens(2464));        
    }        

    private static int isEvens(int n)
    {
        int a = n % 10;

        n = n / 10;
        
        if (a % 2 == 0) // Check if remainder is even
        {
            if (n == 0)
            {
                return 1;
            }
            else
            {
                return isEvens(n);
            }
        }
        else
        {
            return 0;
        }

    }
}