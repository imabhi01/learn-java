public class MadhavArray {
    public static void main(String[] args){
        // System.out.println(madhav(new int[] {2, 1, 1}));
        System.out.println(madhav(new int[] {2, 1, 1, 4, -1, -1}));
    }

    public static int madhav(int[] arr){
        
        boolean flag = true;
        
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int sum = 0;
            for(int j = i+1; i < 2; i++){
                sum += arr[j];
            }

            System.out.println(sum);
            
        }

        return flag == true ? 1 : 0;
    }
}
