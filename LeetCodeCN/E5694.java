import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * https://leetcode-cn.com/contest/biweekly-contest-48/problems/design-authentication-manager/
 *
 * @author RABBIT2002
 * @date 2021/3/20
 */
public class E5694 {
    int currentTime;
    int timeToLive;
    Map<String, Integer> map;

    public E5694(int timeToLive) {
        this.currentTime = 0;
        this.timeToLive = timeToLive;
        this.map = new HashMap<>();
    }

    public static void main(String[] args) {
        // 1 0
        E5694 e5694 = new E5694(5);
        e5694.renew("aaa", 1);
        e5694.generate("aaa", 2);
        e5694.countUnexpiredTokens(6);
        e5694.generate("bbb", 7);
        e5694.renew("aaa", 8);
        e5694.renew("bbb", 10);
        e5694.countUnexpiredTokens(15);

        System.out.println();

        // 0 0 0 0
        e5694 = new E5694(6);
        e5694.countUnexpiredTokens(5);
        e5694.countUnexpiredTokens(6);
        e5694.countUnexpiredTokens(7);
        e5694.generate("kxlq", 9);
        e5694.renew("avem", 10);
        e5694.countUnexpiredTokens(15);
        e5694.renew("kxlq", 18);
        e5694.generate("y", 19);
        e5694.generate("r", 25);
        e5694.generate("cmeix", 29);
        e5694.generate("zfx", 30);

        System.out.println();

        // 0 0 4 3 3 2 2 2 2
        e5694 = new E5694(13);
        e5694.renew("ajvy", 1);
        e5694.countUnexpiredTokens(3);
        e5694.countUnexpiredTokens(4);
        e5694.generate("fuzxq", 5);
        e5694.generate("izmry", 7);
        e5694.renew("puv", 12);
        e5694.generate("ybiqb", 13);
        e5694.generate("gm", 14);
        e5694.countUnexpiredTokens(15);
        e5694.countUnexpiredTokens(18);
        e5694.countUnexpiredTokens(19);
        e5694.renew("ybiqb", 21);
        e5694.countUnexpiredTokens(23);
        e5694.countUnexpiredTokens(25);
        e5694.countUnexpiredTokens(26);
        e5694.generate("aqdm", 28);
        e5694.countUnexpiredTokens(29);
        e5694.renew("puv", 30);

        System.out.println();

        // 0 0 0 2 2 2 2 1 0 0 0 1 1 2 2 1 1 1 1 3 4 4 4 3 3 2 1 0 0
        e5694 = new E5694(104);
        e5694.renew("ox", 50);
        e5694.countUnexpiredTokens(73);
        e5694.countUnexpiredTokens(87);
        e5694.countUnexpiredTokens(93);
        e5694.generate("yyeu", 104);
        e5694.generate("r", 131);
        e5694.countUnexpiredTokens(167);
        e5694.countUnexpiredTokens(172);
        e5694.countUnexpiredTokens(191);
        e5694.countUnexpiredTokens(206);
        e5694.countUnexpiredTokens(232);
        e5694.renew("r", 235);
        e5694.countUnexpiredTokens(239);
        e5694.countUnexpiredTokens(257);
        e5694.renew("vi", 268);
        e5694.countUnexpiredTokens(292);
        e5694.generate("vi", 296);
        e5694.renew("yu", 303);
        e5694.countUnexpiredTokens(326);
        e5694.countUnexpiredTokens(339);
        e5694.renew("aimzm", 343);
        e5694.renew("umdzy", 346);
        e5694.renew("qyf", 347);
        e5694.generate("mfne", 353);
        e5694.renew("nn", 357);
        e5694.generate("hz", 359);
        e5694.countUnexpiredTokens(422);
        e5694.countUnexpiredTokens(434);
        e5694.generate("pel", 473);
        e5694.countUnexpiredTokens(494);
        e5694.countUnexpiredTokens(498);
        e5694.countUnexpiredTokens(508);
        e5694.countUnexpiredTokens(524);
        e5694.renew("pt", 552);
        e5694.generate("vbaa", 568);
        e5694.generate("gt", 592);
        e5694.generate("zxdv", 611);
        e5694.countUnexpiredTokens(618);
        e5694.renew("fbp", 619);
        e5694.generate("giih", 622);
        e5694.countUnexpiredTokens(623);
        e5694.countUnexpiredTokens(629);
        e5694.generate("chmi", 659);
        e5694.generate("doohl", 671);
        e5694.generate("svxbv", 715);
        e5694.countUnexpiredTokens(722);
        e5694.countUnexpiredTokens(749);
        e5694.countUnexpiredTokens(754);
        e5694.countUnexpiredTokens(771);
        e5694.countUnexpiredTokens(794);
        e5694.renew("pel", 865);
        e5694.renew("i", 919);
        e5694.renew("aqa", 962);
        e5694.countUnexpiredTokens(976);
        e5694.countUnexpiredTokens(978);
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (map.get(tokenId) != null && map.get(tokenId) > currentTime) {
            generate(tokenId, currentTime);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;

        Iterator entries = map.entrySet().iterator();

        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            String key = (String) entry.getKey();
            int value = (int) entry.getValue();
            if (value > currentTime) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
