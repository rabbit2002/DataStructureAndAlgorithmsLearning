package OJ_08;

import java.util.Scanner;

public class OJ_08_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OJ_08_09 main = new OJ_08_09();

        int length = scanner.nextInt();
        int[] endTree = new int[length];
        int[] midTree = new int[length];
        int[] layTree = new int[length];

        //        for (int i = 0; i < length; i++) {
        //            endTree[i] = scanner.nextInt();
        //        }
        //        for (int i = 0; i < length; i++) {
        //            midTree[i] = scanner.nextInt();
        //        }

        System.out.println(main.deal(7, new int[]{7})[0]);
        System.out.println(main.deal(7, new int[]{7})[1]);
        System.out.println(main.deal(7, new int[]{7})[2]);
        System.out.println(main.deal(7, new int[]{7})[3]);


    }

    //LB LE RB RE
    public int[] deal(int find, int[] midTree) {
        int[] returnArr = new int[4];
        for (int i = 0; i < midTree.length; i++) {
            if (midTree[i] == find) {
                returnArr[0] = 0;
                returnArr[1] = i - 1;
                returnArr[2] = i + 1;
                returnArr[3] = midTree.length;
            }
        }
        return returnArr;
    }
}
