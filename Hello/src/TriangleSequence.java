

public class TriangleSequence {
    public static void main(String[] args){
        int rows = 5;
        for(int i = 0; i < rows; i++){
            
            int num = 1;
            
            for(int dash = rows; dash >= i; dash--){
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++){
                
                System.out.print(num);
                
                if(j < i){
                    System.out.print(" ");
                }

                

            }

            System.out.println('\n');

        }
    }
}
