// . Let us define two arrays as “set equal” if every element in one is also in the other and vice-versa.
// For example, any two of the following are equal to one another: {1, 9, 12}, {12, 1, 9}, {9, 1, 12, 1}, {1,
// 9, 12, 9, 12, 1, 9}. Note that {1, 7, 8} is not set equal to {1, 7, 1} or {1, 7, 6}.
// Write a function named isSetEqual(int[ ] a, int[ ] b) that returns 1 if its array arguments are set equal,
// otherwise it returns 0.

public class SetEqual {
    public static void main(String[] args){
        System.out.println(setEqual(new int[]{1,9,12}, new int[]{12, 1, 9}));
        System.out.println(setEqual(new int[]{1,19,2}, new int[]{12, 1, 9 ,2}));
        System.out.println(setEqual(new int[]{9, 1, 12, 1}, new int[]{1,9, 12, 9, 12, 1, 9}));
        System.out.println(setEqual(new int[]{1, 7, 8}, new int[]{1,7,1}));
        System.out.println(setEqual(new int[]{1, 7, 8}, new int[]{1, 7, 6}));
    }

    public static int setEqual(int[] arr1, int[] arr2){
        
        boolean flag;
        
        for(int i = 0; i < arr1.length; i++){
            flag = false;
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    flag = true;
                    break;
                }
            }
            
            if(!flag){ // if arr1[i] does not exist in arr2[j] for all values then it should return 0
                return 0;
            }
        }
        
        return 1;
    }
}
