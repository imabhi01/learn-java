// A Daphne array is defined to be an array that contains at least one odd number and begins and
// ends with the same number of even numbers.
// So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Daphne array because it begins with three even
// numbers and ends with three even numbers and it contains at least one odd number
// The array {2, 4, 6, 8, 6} is not a Daphne array because it does not contain an odd number.
// The array {2, 8, 7, 10, -4, 6} is not a Daphne array because it begins with two even numbers but ends
// with three even numbers.
// Write a function named isDaphne that returns 1 if its array argument is a Daphne array. Otherwise, it
// returns 0.
// If you are writing in Java or C#, the function signature is
//  int isDaphne (int[ ] a)

public class Danphe {
    public static void main(String[] args){
        System.out.println(danphe(new int[] {4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6}));
        System.out.println(danphe(new int[] {2, 4, 6, 8, 6}));
        System.out.println(danphe(new int[] {2, 8, 7, 10, -4, 6}));
    }

    public static int danphe(int[] arr){
        int a = 0; 
        int b = 0;
        int oddCount = 0;
        
        for(int i = 0; i <= arr.length/2; i++){ // check even number count from the begining till mid of the array note loops runs till mid i.e, i <= arr.length/2
            if(arr[i] % 2 == 0){
                a++;
                if(arr[i+1] % 2 != 0){ // check if even numbers are not continuously aligned then break and add count for odd
                    oddCount++;
                    break;
                    
                }
            }
        }

        for(int j = arr.length-1; j >= arr.length / 2; j--){ // check even number count from the end till mid of the array note loops runs till mid i.e, j >= arr.length/2
            if(arr[j] % 2 == 0){
                b++;
                if(arr[j-1] % 2 != 0){  // check if even numbers are not continuously aligned then break and add count for odd
                    oddCount++;
                    break;
                }
            }
        }

        System.out.println(a + " " + b);

        if(a == b && oddCount != 0){
            return 1;
        }

        return 0;

    }
}
