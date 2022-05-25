public class NextPerfectSquare{
    public static void main(String[] args){
        System.out.println(isSquare(6));
        System.out.println(isSquare(36));
        System.out.println(isSquare(0));
        System.out.println(isSquare(-1));
        System.out.println(isSquare(-1));
    }

    public static int isSquare(int n){
        
        int square = 0;

        if(n == 0) return 1;
        
        for(int i = 1; i < n;i++){
            if(i*i > n){
                square = i*i;
                break;
            }
        }
        return square;
    }
}
