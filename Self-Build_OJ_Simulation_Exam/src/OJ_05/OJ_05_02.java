package OJ_05;

import java.util.Scanner;

public class OJ_05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            double m = scanner.nextDouble() / 100;
            double kg = scanner.nextDouble();
            double bmi = kg / m / m;
            if (bmi <= 18.4) {
                System.out.println("duo chi rou!");
            } else if (bmi <= 23.9) {
                System.out.println("wan mei!");
            } else if (bmi <= 27.9) {
                System.out.println("shao chi rou!");
            } else {
                System.out.println("yao zhu yi!");
            }
        }
    }
}
