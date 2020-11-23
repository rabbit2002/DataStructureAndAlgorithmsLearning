package Util;

public class countUsedMemory {

    private static long startMemory;
    private static long endMemory;

    public static void countUsedMemoryStart() {
        System.gc();
        startMemory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
    }

    public static void countUsedMemoryEnd() {
        System.gc();
        endMemory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        System.out.println("对象内存:" + (startMemory - endMemory) / 1024.0 + " KB");
    }
}
