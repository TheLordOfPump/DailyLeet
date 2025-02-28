package y2025;

/**Given a string s consisting of words and spaces, return the length of the last word in the string.

 A word is a maximal substring consisting of non-space characters only.*/
public class d26 {
    public static int lengthOfLastWord(String s) {
        int length = 0, i = s.length() - 1;
                while (i >= 0 && s.charAt(i) == ' ') i--;
                while (i >= 0 && s.charAt(i) != ' ') {
                    length++;
                    i--;
                }
                return length;
    }
    public static void main(String[] args) {
        String s = "Hello World  ";
        System.out.println(lengthOfLastWord(s));
    }
}

