public class ConcatenatedSum {
    public static int getConcatenatedSum(int a, int catlen){
        
        int actualNumber = a; // fix integer with variable to compare later
        int rem = 0;
        int sum = 0;
 
        while(a != 0){
            rem = a % 10;
            a = a / 10;
            int catSum = 0;
            for(int i = 0; i < catlen; i++){
                catSum = (rem * (int) Math.pow(10, catlen - 1) ) + rem; // catlen -1 pow of 10 is equal to get 10, 100, 1000 for (1,2,3,4) resp.
            }
            System.out.println(rem);
            System.out.println(catSum);
            sum = sum + catSum;
        }

        return sum == actualNumber ? 1 : 0;

    }
    public static void main(String[] args){
        System.out.println(getConcatenatedSum(198, 2));
        System.out.println(getConcatenatedSum(198, 3));
        System.out.println(getConcatenatedSum(2997, 3));
        System.out.println(getConcatenatedSum(2997, 2));
        System.out.println(getConcatenatedSum(13332, 4));
    }
}
