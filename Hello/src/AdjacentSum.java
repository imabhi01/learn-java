public class AdjacentSum {
    
    public static int largestAdjacentSum(int[] a){
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < a.length - 1; i++){
            int AdjacentSum = a[i] + a[i+1];
            if(AdjacentSum > max){
                max = AdjacentSum;
            }
        }

        return max;
        
    }
    public static void main(String[] args){
        System.out.println(largestAdjacentSum(new int[] {1,2,3,4}));
        System.out.println(largestAdjacentSum(new int[] {18,-12,9,-10}));
        System.out.println(largestAdjacentSum(new int[] {1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[] {1,1,1,2,1,1,1,1,1}));
    }
}
