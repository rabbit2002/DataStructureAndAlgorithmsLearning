import java.util.Iterator;
import java.util.TreeSet;

public class LC1796_secondLargestDigitInAString {
    public static void main(String[] args) {
        System.out.println(new LC1796_secondLargestDigitInAString().secondHighest("dfa12321afd"));
        System.out.println(new LC1796_secondLargestDigitInAString().secondHighest("abc1111"));
    }

    public int secondHighest(String s) {
        char[] chars = s.toCharArray();
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 57) {
                continue;
            } else {
                int num = chars[i] - 48;
                integerTreeSet.add(num);
            }
        }
        if (integerTreeSet.size() <= 1) {
            return -1;
        }
        Iterator iterator = integerTreeSet.descendingIterator();
        iterator.next();
        int output = (int) iterator.next();
        return output;
    }
}
