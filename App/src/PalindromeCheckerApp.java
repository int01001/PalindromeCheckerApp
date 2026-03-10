public class PalindromeCheckerUC9 {

public static void main(String[] args) {
String word = &quot;level&quot;;
boolean result = isPalindrome(word, 0, word.length() - 1);

if (result) {
System.out.println(&quot;The string \&quot;&quot; + word + &quot;\&quot; is a palindrome.&quot;);
} else {
System.out.println(&quot;The string \&quot;&quot; + word + &quot;\&quot; is not a palindrome.&quot;);
}
}

static boolean isPalindrome(String str, int start, int end) {
if (start &gt;= end) {
return true;
}

if (str.charAt(start) != str.charAt(end)) {
return false;
}

return isPalindrome(str, start + 1, end - 1);
}
}