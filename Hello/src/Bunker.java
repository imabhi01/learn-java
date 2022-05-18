// Series to print infinite sequence 1, 2, 4, 7, 11, 16, 22, … Note that 2-1=1, 4-2=2, 7-4=3, 11-7=4, 16-11=5 so for k>1, the kth element of the sequence

public class Bunker {
    public static void main(String[] args){
        System.out.println(bunker(30));
    }

    public static int bunker(int n){
        int previous = 0;
        int j = 1;
        for(int i = 1; i <= n; i++){
            if(i - previous == j){
                System.out.println(i);
                previous = i;
                if(i >= 2){
                    j++;
                }
            }
           
        }
        
        return 1;
    }
}
