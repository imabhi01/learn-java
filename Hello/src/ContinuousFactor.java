import javafx.scene.SubScene;

// An integer is defined to be “continuous factored” if it can be expressed as the product of two or
// more continuous integers greater than 1.
// Examples of “continuous factored” integers are:
// 6 = 2 * 3.
// 60 = 3 * 4 * 5
// 120 = 4 * 5 * 6
// 90 = 9*10
// Examples of integers that are NOT “continuous factored” are: 99 = 9*11, 121=11*11, 2=2, 13=13
// Write a function named isContinuousFactored(int n) that returns 1 if n is continuous factored and 0
// otherwise

public class ContinuousFactor {
    public static void main(String[] args){
        System.out.println(isContinuousFactor(6));
        System.out.println(isContinuousFactor(60));
        System.out.println(isContinuousFactor(90));
        System.out.println(isContinuousFactor(121));
    }

    public static int isContinuousFactor(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                int product = i;
                for(int j = i+1; j < n ; j++){
                    if(n % j != 0){ // if the continuous number is not a factor then that is removed - Break the loop and continues with another factor in the next run
                        break;
                    }else{
                        product = product * j;
                        if(product == n){
                            return 1;
                        }
                    }
                }
                             
            }
        }

     
        return 0;
    }
}
