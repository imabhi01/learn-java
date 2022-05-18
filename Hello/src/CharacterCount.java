// Given a string and a character return how many times the given character is present in that string
// Input : str = "geeksforgeeks"
//          c = 'e'
// Output : 4
// 'e' appears four times in str.

// Input : str = "abccdefgaa"
//           c = 'a' 
// Output : 3
// 'a' appears three times in str.

public class CharacterCount {
    public static void main(String[] args){
        System.out.println(charCount("geeksforgeeks", 'e'));
    }

    public static int charCount(String s, char c){
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        // System.out.println(count);
        return count;
    }
}
