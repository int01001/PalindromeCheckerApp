import java.util.*;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toLowerCase().toCharArray()) {
            list.add(c);
        }
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "level";
        System.out.println(isPalindrome(input));
    }
}