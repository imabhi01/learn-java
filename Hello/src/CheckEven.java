public class CheckEven{
    
    public static void main(String args[])
    {
        System.out.println(isEvens(102));        
        System.out.println(isEvens(20234));        
        System.out.println(isEvens(30));        
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