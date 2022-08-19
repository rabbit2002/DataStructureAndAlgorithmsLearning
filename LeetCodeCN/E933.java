import java.util.ArrayList;
import java.util.List;

public class E933 {
    public static void main(String[] args) {
        RecentCounter q1 = new RecentCounter();
        System.out.println(q1.ping(1));
        System.out.println(q1.ping(100));
        System.out.println(q1.ping(3001));
        System.out.println(q1.ping(3002));
    }

    static class RecentCounter {

        List<Integer> list = null;

        public RecentCounter() {
            list = new ArrayList<>();
        }

        public int ping(int t) {
            list.add(t);
            int tmp = 0;
            for (int i = list.size() - 1; i >= 0; i--) {
                int val = list.get(i);
                if (val < t - 3000) {
                    break;
                }
                tmp++;
            }
            return tmp;
        }
    }
}
