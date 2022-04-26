public class CheckEven{
    public static void main(String[] args){
        
        int number = 2031;
        boolean isEven = false;

        while(number != 0){
            number = number / 10;
            if(number % 2 == 0){
                isEven = true;
            }
        }

        System.out.println(isEven);

        if(isEven == true){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}