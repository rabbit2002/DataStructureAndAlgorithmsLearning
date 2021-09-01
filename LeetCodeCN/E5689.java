import java.util.List;

/**
 * description TODO
 *
 * @author RABBIT2002
 * @date 2021/2/28
 */
public class E5689 {
    public static void main(String[] args) {

    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            List<String> list = items.get(i);

            if (ruleKey.equals("type")) {
                if (list.get(0).equals(ruleValue)) {
                    count++;
                }
            }
            if (ruleKey.equals("color")) {
                if (list.get(1).equals(ruleValue)) {
                    count++;
                }
            }
            if (ruleKey.equals("name")) {
                if (list.get(2).equals(ruleValue)) {
                    count++;
                }
            }
        }

        return count;
    }
}
