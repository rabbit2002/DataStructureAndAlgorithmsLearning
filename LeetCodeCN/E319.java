public class E319 {
    public static void main(String[] args) {
        int q1 = 16;
        int a1 = new E319().bulbSwitch(q1);
        System.out.println(a1);
    }

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
