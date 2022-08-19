public class E319_BulbSwitcher {
    public static void main(String[] args) {
        // 1
        System.out.println(new E319_BulbSwitcher().bulbSwitch(3));
        // 0
        System.out.println(new E319_BulbSwitcher().bulbSwitch(0));
        // 1
        System.out.println(new E319_BulbSwitcher().bulbSwitch(1));
        // 4
        System.out.println(new E319_BulbSwitcher().bulbSwitch(16));
    }

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
