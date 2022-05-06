// Write a function named minDistance that returns the smallest distance between two factors of a
// number. For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013.
// minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 -
// 11 = 2). As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8
// and the smallest distance between any two factors is 1 (2 – 1 = 1).
// The function signature is
//  int minDistance(int n)

public class MinDistance {
    public static void main(String[] args){
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
    }

    public static int minDistance(int n){
        int min = Integer.MAX_VALUE;
        int factorOne = 0;
        int factorTwo = 0;
        boolean nextFactor = false;
        for(int i = 1; i <= n ; i++){
            if(n % i == 0){

                if(nextFactor == false){
                    factorOne = i;
                    nextFactor = true;
                }else{
                    factorTwo = i;
                    nextFactor = false;
                }
                
                if(factorOne != 0 && factorTwo != 0){
                    if(Math.abs(factorTwo - factorOne) < min){
                        min = Math.abs(factorTwo - factorOne);
                    }
                }
                
                // System.out.println("factorOne " + factorOne + " factorTwo " + factorTwo);
                // System.out.println("min " + min);
            }
        }

        return min;
    }
}
