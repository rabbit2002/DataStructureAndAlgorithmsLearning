/**
 * https://leetcode-cn.com/problems/bulls-and-cows/
 */
public class E299 {
    public static void main(String[] args) {
        String q11 = "1";
        String q12 = "1";
        String a1 = new E299().getHint(q11, q12);
        // 1A3B
        System.out.println(a1);
    }

    public String getHint(String secret, String guess) {
        char[] secretArr = secret.toCharArray();
        char[] guessArr = guess.toCharArray();

        // 队列1数字+ 队列2数字-
        int[] numArr = new int[10];

        int allSame = 0;
        int valSame = 0;

        for (int i = 0; i < secretArr.length; i++) {
            int arr1 = secretArr[i] - 48;
            int arr2 = guessArr[i] - 48;

            if (arr1 == arr2) {
                allSame++;
                continue;
            }

            // 该数字队列2已经有了
            if (numArr[arr1] < 0) {
                valSame++;
            }
            // 队列1存在该数字 记录
            numArr[arr1]++;

            // 该数字队列1已经有了
            if (numArr[arr2] > 0) {
                valSame++;
            }
            // 队列2存在该数字 记录
            numArr[arr2]--;
        }
        return allSame + "A" + valSame + "B";
    }
}
