package OJ_07;

import java.util.ArrayList;
import java.util.Scanner;

public class OJ_07_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int aStart = scanner.nextInt();
        int bStart = scanner.nextInt();
        int length = scanner.nextInt();
        int[][] nodeList = new int[length][3];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 3; j++) {
                nodeList[i][j] = scanner.nextInt();
            }
        }
        ArrayList arrayListA = new ArrayList();
        ArrayList arrayListB = new ArrayList();
        int temp = aStart;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (temp == nodeList[j][0]) {
                    arrayListA.add(j);
                    temp = nodeList[j][2];
                }
                if (temp == -1) {
                    break;
                }
            }
        }
        temp = bStart;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (temp == nodeList[j][0]) {
                    arrayListB.add(j);
                    temp = nodeList[j][2];
                }
                if (temp == -1) {
                    break;
                }
            }
        }
        ArrayList arrayListLong = null;
        ArrayList arrayListShort = null;
        if (arrayListA.size() > arrayListB.size()) {
            arrayListLong = arrayListA;
            arrayListShort = arrayListB;
        } else {
            arrayListLong = arrayListB;
            arrayListShort = arrayListA;
        }
        ArrayList arrayListTemp = new ArrayList();
        for (int i = arrayListShort.size() - 1; i >= 0; i--) {
            arrayListTemp.add(arrayListShort.get(i));
        }
        arrayListShort = arrayListTemp;
        arrayListTemp = new ArrayList();
        int x = 0;
        int y = 0;
        for (int i = 0; i < arrayListShort.size(); i++) {
            arrayListTemp.add(arrayListLong.get(x));
            x++;
            arrayListTemp.add(arrayListLong.get(x));
            x++;
            arrayListTemp.add(arrayListShort.get(y));
            y++;
        }
        for (int i = arrayListShort.size() * 2; i < arrayListLong.size(); i++) {
            arrayListTemp.add(arrayListLong.get(i));
        }
        for (int i = 0; i < arrayListTemp.size(); i++) {
            if (i < arrayListTemp.size() - 1) {
                System.out.printf("%05.0f", (float)nodeList[(int)arrayListTemp.get(i)][0]);
                System.out.print(" " + nodeList[(int)arrayListTemp.get(i)][1] + " ");
                System.out.printf("%05.0f", (float)nodeList[(int)arrayListTemp.get(i + 1)][0]);
                System.out.println();
            }
        }

        System.out.printf("%05.0f", (float)nodeList[(int)arrayListTemp.get(length - 1)][0]);
        System.out.println(" " + nodeList[(int)arrayListTemp.get(length - 1)][1] + " -1");
    }
}
