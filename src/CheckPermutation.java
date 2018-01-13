public class CheckPermutation {


    public static String sort(String s) {
        char [] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean CheckPermutation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    public static void main(String[]args) {
        System.out.println(CheckPermutation("abcdee", "abeeed"));
    }

}
