import java.util.HashMap;
import java.util.Map;

class LC205_isomorphicStrings {
    Map<Character, Character> keyMapS = new HashMap<>();
    Map<Character, Character> keyMapT = new HashMap<>();

    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            char sChar = keyMapS.containsKey(s.charAt(i)) ? keyMapS.get(s.charAt(i)) : ' ';
            char tChar = keyMapT.containsKey(t.charAt(i)) ? keyMapT.get(t.charAt(i)) : ' ';

            if (sChar == ' ' && tChar == ' '
                    || tChar == s.charAt(i) && sChar == t.charAt(i)) {
                keyMapS.put(s.charAt(i), t.charAt(i));
                keyMapT.put(t.charAt(i), s.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new LC205_isomorphicStrings().isIsomorphic("abc", "bca"));
        System.out.println(new LC205_isomorphicStrings().isIsomorphic("egg", "add"));
        System.out.println(new LC205_isomorphicStrings().isIsomorphic("foo", "bar"));
        System.out.println(new LC205_isomorphicStrings().isIsomorphic("badc", "baba"));
    }
}