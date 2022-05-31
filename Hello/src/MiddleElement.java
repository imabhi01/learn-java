public class MiddleElement {
    public static void main(String[] args){
        System.out.println(middleElement(new int[] {1, 2, 3, 4, 5}));
        System.out.println(middleElement(new int[] {3, 2, 1, 4, 5}));
    }

    public static int middleElement(int[] arr){
        
        if(arr.length % 2 == 0 || arr == null) return 0;

        int midElement = arr[arr.length/2];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != midElement && midElement >= arr[i]){
                return 0;
            }
        }

        return 1;
    }
}
