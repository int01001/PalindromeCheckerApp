import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerUC13 {

static boolean reverseCheck(String str) {
String reversed = &quot;&quot;;
for (int i = str.length() - 1; i &gt;= 0; i--) {
reversed = reversed + str.charAt(i);
}
return str.equals(reversed);
}

static boolean twoPointerCheck(String str) {
int start = 0;
int end = str.length() - 1;
while (start &lt; end) {
if (str.charAt(start) != str.charAt(end)) {
return false;
}
start++;
end--;
}
return true;
}

static boolean stackCheck(String str) {
Stack&lt;Character&gt; stack = new Stack&lt;&gt;();
for (int i = 0; i &lt; str.length(); i++) {
stack.push(str.charAt(i));

}
for (int i = 0; i &lt; str.length(); i++) {
if (str.charAt(i) != stack.pop()) {
return false;
}
}
return true;
}

static boolean dequeCheck(String str) {
Deque&lt;Character&gt; deque = new ArrayDeque&lt;&gt;();
for (int i = 0; i &lt; str.length(); i++) {
deque.addLast(str.charAt(i));
}
while (deque.size() &gt; 1) {
if (deque.removeFirst() != deque.removeLast()) {
return false;
}
}
return true;
}

public static void main(String[] args) {
String word = &quot;racecar&quot;;

long start1 = System.nanoTime();

boolean r1 = reverseCheck(word);
long end1 = System.nanoTime();

long start2 = System.nanoTime();
boolean r2 = twoPointerCheck(word);
long end2 = System.nanoTime();

long start3 = System.nanoTime();
boolean r3 = stackCheck(word);
long end3 = System.nanoTime();

long start4 = System.nanoTime();
boolean r4 = dequeCheck(word);
long end4 = System.nanoTime();

System.out.println(&quot;Reverse String Approach: &quot; + (end1 - start1) + &quot; ns Result: &quot; + r1);
System.out.println(&quot;Two Pointer Approach: &quot; + (end2 - start2) + &quot; ns Result: &quot; + r2);
System.out.println(&quot;Stack Approach: &quot; + (end3 - start3) + &quot; ns Result: &quot; + r3);
System.out.println(&quot;Deque Approach: &quot; + (end4 - start4) + &quot; ns Result: &quot; + r4);
}
}