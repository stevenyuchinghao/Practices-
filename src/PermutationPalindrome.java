import java.util.HashMap;

public class PermutationPalindrome {

    public static boolean checkPermutationPalindrome(String string) {

        string = string.replaceAll(" ", "");
        java.util.Map<Character, Integer> dict = new HashMap<Character, Integer>();
        for(int i = 0; i < string.length(); i++) {
            if(dict.get(string.charAt(i)) == null || dict.get(string.charAt(i)) == 0) {
                dict.put(string.charAt(i), 1);
            }
            else {
                dict.put(string.charAt(i),dict.get(string.charAt(i))-1);
            }
        }
        int sum = 0;
        if (string.length() %2 == 0) {
            for(Integer value : dict.values()){
                sum = sum + value;
            }
            if (sum > 0) {
                return false;
            }
        }
        else {
            for(Integer value : dict.values()){
                sum = sum + value;
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args) {
        System.out.println(checkPermutationPalindrome("erttre "));
        System.out.println(checkPermutationPalindrome("abcde  "));
        System.out.println(checkPermutationPalindrome("eettaakkslslslsls"));
        System.out.println(checkPermutationPalindrome("aabbe  "));
        System.out.println(checkPermutationPalindrome("a  "));
    }
}

