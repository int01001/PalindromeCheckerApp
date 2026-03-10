public class PalindromeCheckerUC10 {

public static void main(String[] args) {
String input = &quot;A man a plan a canal Panama&quot;;
String normalized = input.replaceAll(&quot;\\s+&quot;, &quot;&quot;).toLowerCase();

boolean isPalindrome = true;
int start = 0;
int end = normalized.length() - 1;

while (start &lt; end) {
if (normalized.charAt(start) != normalized.charAt(end)) {
isPalindrome = false;
break;
}
start++;

end--;
}

if (isPalindrome) {
System.out.println(&quot;The string \&quot;&quot; + input + &quot;\&quot; is a palindrome.&quot;);
} else {
System.out.println(&quot;The string \&quot;&quot; + input + &quot;\&quot; is not a palindrome.&quot;);
}
}
}