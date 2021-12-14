import Method.StringQues;

public class Main {
    public static void main(String[] args) {
        StringQues stringQues = new StringQues();
        String input = "abcadef";

//        System.out.println(stringQues.longestSubstringWithoutRepeat(input));
//        System.out.println(stringQues.reverseString(input));
        stringQues.countDups(input);

    }

}
