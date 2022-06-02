public class ReverseInteger {
    public static void main(String[] args){
        // System.out.println(reverse(3321));
        System.out.println(reverse(-54321));
        System.out.println(reverse(12005));
        System.out.println(reverse(1));
        System.out.println(reverse(0));
    }

    // reverse = 1
    // reverse = 1 * 10 + 2
    // reverse = 12*10 + 3
    // reverse = 123*10 = 3
    // reverse = 1233

    public static int reverse(int num){

        if(num == 0) return 0;

        int reverse = 0;
        
        while(num != 0){
            reverse = (reverse*10) + (num % 10);
            num = num / 10;
        }

        System.out.println(reverse);

        return 1;
    }
}
