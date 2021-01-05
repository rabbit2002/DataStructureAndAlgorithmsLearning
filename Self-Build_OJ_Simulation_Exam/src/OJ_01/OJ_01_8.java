package OJ_01;

import java.util.Scanner;

public class OJ_01_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String[] name = new String[count];
        String[] numStr = new String[count];
        int[] score = new int[count];
        int maxScore = 0;
        int maxScorePoint = -1;
        int minScore = 100;
        int minScorePoint = -1;
        for (int i = 0; i < count; i++) {
            name[i] = scanner.next();
            numStr[i] = scanner.next();
            score[i] = scanner.nextInt();
            if (maxScore < score[i]) {
                maxScore = score[i];
                maxScorePoint = i;
            }
            if (minScore > score[i]) {
                minScore = score[i];
                minScorePoint = i;
            }
        }
        System.out.println(name[maxScorePoint] + " " + numStr[maxScorePoint]);
        System.out.println(name[minScorePoint] + " " + numStr[minScorePoint]);
    }
}
