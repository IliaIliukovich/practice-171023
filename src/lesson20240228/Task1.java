package lesson20240228;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ABCBA"));
    }

    public static boolean isPalindrome(String s){
        if (s.length() <= 1) return true; // base condition
        int i = s.length() - 1;
        return s.charAt(i) == s.charAt(0) && isPalindrome(s.substring(1, s.length() - 1));
    }
}
