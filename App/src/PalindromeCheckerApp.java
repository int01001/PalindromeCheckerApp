class PalindromeChecker {

boolean checkPalindrome(String input) {
int start = 0;
int end = input.length() - 1;

while (start < end) {
if (input.charAt(start) != input.charAt(end)) {
return false;
}
start++;
end--;
}

return true;
}
}

public class PalindromeCheckerUC11 {

public static void main(String[] args) {
String word = "level";
PalindromeChecker checker = new PalindromeChecker();

if (checker.checkPalindrome(word)) {
System.out.println("The string \"" + word + "\" is a palindrome.");
} else {
System.out.println("The string \"" + word + "\" is not a palindrome.");
}
}
}