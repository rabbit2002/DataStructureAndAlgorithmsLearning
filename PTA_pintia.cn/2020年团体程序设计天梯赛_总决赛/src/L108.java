import java.util.Scanner;

/**
 * L1-8 刮刮彩票
 * <p>
 * “刮刮彩票”是一款网络游戏里面的一个小游戏。如图所示：
 * 每次游戏玩家会拿到一张彩票，上面会有 9 个数字，分别为数字 1 到数字 9，数字各不重复，并以 3×3 的“九宫格”形式排布在彩票上。
 * 在游戏开始时能看见一个位置上的数字，其他位置上的数字均不可见。你可以选择三个位置的数字刮开，这样玩家就能看见四个位置上的数字了。
 * 最后玩家再从 3 横、3 竖、2 斜共 8 个方向中挑选一个方向，方向上三个数字的和可根据下列表格进行兑奖，获得对应数额的金币。
 * 数字合计    获得金币    数字合计    获得金币
 * 6        10,000        16        72
 * 7        36            17        180
 * 8        720           18        119
 * 9        360           19        36
 * 10       80            20        306
 * 11       252           21        1,080
 * 12       108           22        144
 * 13       72            23        1,800
 * 14       54            24        3,600
 * 15       180
 * 现在请你写出一个模拟程序，模拟玩家的游戏过程。
 * <p>
 * 输入格式:
 * 输入第一部分给出一张合法的彩票，即用 3 行 3 列给出 0 至 9 的数字。0 表示的是这个位置上的数字初始时就能看见了，而不是彩票上的数字为 0。
 * 第二部给出玩家刮开的三个位置，分为三行，每行按格式 x y 给出玩家刮开的位置的行号和列号（题目中定义左上角的位置为第 1 行、第 1 列。）。
 * 数据保证玩家不会重复刮开已刮开的数字。
 * 最后一部分给出玩家选择的方向，即一个整数：
 * 1 至 3 表示选择横向的第一行、第二行、第三行，4 至 6 表示纵向的第一列、第二列、第三列，7、8分别表示左上到右下的主对角线和右上到左下的副对角线。
 * <p>
 * 输出格式:
 * 对于每一个刮开的操作，在一行中输出玩家能看到的数字。最后对于选择的方向，在一行中输出玩家获得的金币数量。
 * <p>
 * 输入样例:
 * 1 2 3
 * 4 5 6
 * 7 8 0
 * 1 1
 * 2 2
 * 2 3
 * 7
 * <p>
 * 输出样例:
 * 1
 * 5
 * 6
 * 180
 */
public class L108 {
    public static void main(String[] args) {
        // from 6 to 24
        int[] point = new int[]{10000, 36, 720, 360, 80, 252, 108, 72, 54, 180, 72, 180, 119, 36, 306, 1080, 144, 1800, 3600};

        Scanner scanner = new Scanner(System.in);

        int[][] matrixNumber = new int[3][3];
        // boolean[][] matrixFlag = new boolean[3][3];

        int tempI = 0;
        int tempJ = 0;
        int tempSumPoint = 45;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixNumber[i][j] = scanner.nextInt();
                if (matrixNumber[i][j] == 0) {
                    // matrixFlag[i][j] = true;
                    tempI = i;
                    tempJ = j;
                }
                tempSumPoint -= matrixNumber[i][j];
            }
        }
        matrixNumber[tempI][tempJ] = tempSumPoint;
        // System.out.println(tempSumPoint);

        for (int i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // matrixFlag[x - 1][y - 1] = true;
            System.out.println(matrixNumber[x - 1][y - 1]);
        }

        int sum = 0;
        int line = scanner.nextInt();
        if (line == 1) {
            sum = matrixNumber[0][0] + matrixNumber[0][1] + matrixNumber[0][2];
        }
        if (line == 2) {
            sum = matrixNumber[1][0] + matrixNumber[1][1] + matrixNumber[1][2];
        }
        if (line == 3) {
            sum = matrixNumber[2][0] + matrixNumber[2][1] + matrixNumber[2][2];
        }
        if (line == 4) {
            sum = matrixNumber[0][0] + matrixNumber[1][0] + matrixNumber[2][0];
        }
        if (line == 5) {
            sum = matrixNumber[0][1] + matrixNumber[1][1] + matrixNumber[2][1];
        }
        if (line == 6) {
            sum = matrixNumber[0][2] + matrixNumber[1][2] + matrixNumber[2][2];
        }
        if (line == 7) {
            sum = matrixNumber[0][0] + matrixNumber[1][1] + matrixNumber[2][2];
        }
        if (line == 8) {
            sum = matrixNumber[0][2] + matrixNumber[1][1] + matrixNumber[2][0];
        }

        System.out.println(point[sum - 6]);


    }
}
