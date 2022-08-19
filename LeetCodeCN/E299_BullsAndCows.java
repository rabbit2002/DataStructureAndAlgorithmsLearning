public class E299_BullsAndCows {
    public static void main(String[] args) {
        // 1A3B
        System.out.println(new E299_BullsAndCows().getHint("1807", "7810"));
        // 1A1B
        System.out.println(new E299_BullsAndCows().getHint("1123", "0111"));
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
