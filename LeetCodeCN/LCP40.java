import java.util.Arrays;

public class LCP40 {
    public static void main(String[] args) {
        int[] q11 = new int[] { 1, 1, 1 };
        int q12 = 3;
        int a1 = new LCP40().maxmiumScore(q11, q12);
        System.out.println(a1);
    }

    public int maxmiumScore(int[] cards, int cnt) {
        int oriCnt = cnt;
        Arrays.sort(cards);
        int sum = 0;

        int lastOddNum = 0;
        int lastEvenNum = 0;
        for (int i = cards.length - 1; i >= 0; i--) {
            int currentNum = cards[i];
            if (oriCnt == 1) {
                if (currentNum % 2 == 0) {
                    sum += currentNum;
                    break;
                }
            } else {
                if (currentNum % 2 == 0) {
                    lastEvenNum = currentNum;
                } else {
                    lastOddNum = currentNum;
                }

                sum += currentNum;
                cnt--;

                if (cnt == 0 && sum % 2 == 0) {
                    break;
                }

                if (cnt == 0 && sum % 2 != 0) {
                    if (i == 0) {
                        sum = 0;
                        break;
                    }
                    int nextNumber = cards[i - 1];
                    if (nextNumber % 2 == 0) {
                        sum -= lastOddNum;
                        sum += cards[i - 1];
                        break;
                    } else {
                        sum -= lastEvenNum;
                        sum += cards[i - 1];
                        break;
                    }
                }
            }
        }
        return sum;
    }
}
