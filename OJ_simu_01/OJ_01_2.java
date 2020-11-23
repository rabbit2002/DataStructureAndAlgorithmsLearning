import java.util.Scanner;

public class OJ_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int max = 100;
        int areaMax = max * max / 2;
        int xArea = x * y / 2;
        int yArea = (100 - x) * (100 - y) / 2;
        int xyArea = (100 - x) * y;
        int sumArea = areaMax - xArea - yArea - xyArea;
        System.out.println(sumArea);
    }
}
