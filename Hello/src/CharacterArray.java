// Write a function that accepts a character array, a zero-based start position and a length. It should return a character array containing containing lengthcharacters 
// starting with the startcharacter of the input array. The function should do error checking on the start position and the length and 
// return null if the either value is not legal.
// The function signature is:
// char[ ] f(char[ ] a, int start, int len)

import java.util.Arrays;

public class CharacterArray {
    public static void main(String[] args){
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, 0, 4));
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, 0, 3));
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, 0, 2));
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, 0, 1));
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, 1, 2));
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, -1, -2));
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, 1, 0));
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, 3, 1));
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, 2, 1));
        System.out.println(chararray(new char[] {'a', 'b', 'c'}, 2, 2));
    }

    public static java.lang.Integer chararray(char[] characters, int start, int len){
        // System.out.println(start+len + " " +  characters.length);
        if(start+len > characters.length || len < 0 || start < 0){
            return null;
        }

        char[] secondChar = new char[len]; 

        for(int i = start, j = 0; j < len; i++, j++){
            secondChar[j] = characters[i];
        }

        System.out.println(Arrays.toString(secondChar));

        return 1;
    }
}
