import java.util.Scanner;

public class L1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTime[] = scanner.next().split(":");
        int hours = Integer.parseInt(inputTime[0]);
        int mins = Integer.parseInt(inputTime[1]);
        int dangTimes = 0;
        if (hours >= 0 && hours < 12 || hours == 12 && mins == 0) {
            System.out.println("Only " + inputTime[0] + ":" + inputTime[1] + ".  Too early to Dang.");
        } else {
            dangTimes = hours - 12;
            if (mins > 0) {
                dangTimes++;
            }
            for (int i = 0; i < dangTimes; i++) {
                System.out.printf("Dang");
            }
        }
    }
}
