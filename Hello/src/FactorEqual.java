public class FactorEqual {
    public static void main(String[] args){
        System.out.println(factorEqual(10, 33));
    }

    public static int factorEqual(int n, int m){

        int countN = 0;
        int countM = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                // System.out.println(n + " is "+ i);
                countN++;
            }
        }

        for(int j = 1; j < m; j++){
            if(m % j == 0){
                // System.out.println(m + " is "+ j);
                countM++;
            }
        }

        System.out.println(countM + " " + countN);

        return countM == countN ? 1 : 0;
    }
}
