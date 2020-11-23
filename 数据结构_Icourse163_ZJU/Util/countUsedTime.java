package Util;

public class countUsedTime {

    private static long startTime;
    private static long endTime;

    public static void countUsedTimeStart() {
        startTime = System.currentTimeMillis();
    }

    public static void countUsedTimeEnd() {
        endTime = System.currentTimeMillis();
        System.out.println("程序耗时：" + (endTime - startTime) + "毫秒");
    }
}
