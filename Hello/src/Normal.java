// A normal number is defined to be one that has no odd factors, except for 1 and possibly itself.
// Write a method named isNormal that returns 1 if its integer argument is normal, otherwise it returns 0. The
// function signature is
// int isNormal(int n)
// Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd factor. 10 is
// not a normal number since 5 is an odd factor. 

public class Normal {
    public static void main(String[] args){
        System.out.println(normal(5));
        System.out.println(normal(7));
        System.out.println(normal(8));
        System.out.println(normal(6));
        System.out.println(normal(9));
    }

    public static int normal(int n){
        
        boolean oddfactors = false;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                if(i % 2 != 0){
                    oddfactors = true;
                }
            }
        }
        
        return oddfactors == true ? 0 : 1;
    }
}
