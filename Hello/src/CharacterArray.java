// Write a function that accepts a character array, a zero-based start position and a length. It should return a character array containing containing lengthcharacters 
// starting with the startcharacter of the input array. The function should do error checking on the start position and the length and 
// return null if the either value is not legal.
// The function signature is:
// char[ ] f(char[ ] a, int start, int len)

public class CharacterArray {
    public static void main(String[] args){
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, 2, 2));
    }

    public static int chararray(char[] characters, int start, int len){
        // System.out.println("len " + (start+characters.length-1) + " " + (len > characters.length) + " " + (start < characters.length) + " " + (start+characters.length-1 > len));
        if(len > characters.length || start > characters.length || start+characters.length-1 < len){
            // System.out.println("java");
            return 0;
        }

        for(int i = start, j = 0; i < characters.length; i++){
            if(j < len){
                System.out.println(characters[i]);
            }
            j++;
        }

        return 1;
    }
}
