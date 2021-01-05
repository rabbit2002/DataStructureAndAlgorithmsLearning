package OJ_06;

import java.util.Scanner;

public class OJ_06_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String timeStr = scanner.nextLine();
        String[] time = timeStr.split(":");
        int[] timeArr = new int[2];
        timeArr[0] = Integer.parseInt(time[0]);
        timeArr[1] = Integer.parseInt(time[1]);

        // AM false PM true
        boolean flagAmOrPm = false;
        if (timeArr[0] == 24) {
            timeArr[0] = 0;
        }
        if (timeArr[0] >= 12) {
            flagAmOrPm = true;
        }
        if (timeArr[0] > 12) {
            timeArr[0] = timeArr[0] - 12;
        }
        System.out.print(timeArr[0] + ":" + timeArr[1] + " ");
        if (flagAmOrPm) {
            System.out.print("PM");
        } else {
            System.out.print("AM");
        }
    }
}
