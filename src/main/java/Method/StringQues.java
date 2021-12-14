package Method;

import java.util.HashMap;

public class StringQues {

    /**
     * Use the sliding window technique
     * A stays on a character and B goes on till the end of the string to find matching character to A
     * If matching character found by B, A is removed from hashmap and incremented to the next character
     * @param input String
     */
    public void longestSubstringWithoutRepeat(String input) {
        String subString = "";
        HashMap<Character, Integer> visited = new HashMap<Character, Integer>();

        for(int a = 0, b = 0; b < input.length(); b++) {
            char curr = input.charAt(b);
            System.out.println("curr char b: " + curr);
            System.out.println("curr char a: " + input.charAt(a) + " at " + a);

            // remove a from hashmap if it's found
            if(visited.containsKey(curr)) {
                a = Math.max(visited.get(curr)+1, a);
                System.out.println("update a:"+a);
            }

            //add the character to substring
            if(b - a + 1 > subString.length()) {
                subString = input.substring(a, b+1);
                System.out.println("update sub:"+subString);
            }

            visited.put(curr, b);
        }

        System.out.println("Reversed:"+subString);
    }


    /**
     * Use array to reverse
     * Time complexity: O(n)
     * @param input
     */
    public void reverseString(String input) {
        String f = "";
        for(int i = input.length()-1; i >= 0; i--) {
            f += input.charAt(i);
        }

        System.out.println("Reversed:"+f);
    }

    public void countDups(String input) {


    }
}
