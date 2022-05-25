public class upCount {
    public static void main(String[] args){
        System.out.println(upcount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5));
        System.out.println(upcount(new int[]{6,3,1}, 6));
        System.out.println(upcount(new int[]{6,3,1, 4, -10, 5, 9}, 6));
    }

    public static int upcount(int[] arr, int n){
        int partialSum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            // System.out.println(partialSum + "   " + (partialSum + arr[i]));
            if((partialSum < n || partialSum == n) && (partialSum + arr[i]) > n){
                count++;
                // System.out.println(count);
            }
            partialSum += arr[i];
        }

        return count;
    }
}
