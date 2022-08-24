public class LC191_NumberOf1Bits {
    public static void main(String[] args) {
        // 3
        System.out.println(new LC191_NumberOf1Bits().hammingWeight(0b00000000000000000000000000001011));
        // 1
        System.out.println(new LC191_NumberOf1Bits().hammingWeight(0b00000000000000000000000010000000));
        // 31
        System.out.println(new LC191_NumberOf1Bits().hammingWeight(0b11111111111111111111111111111101));
        // 32
        System.out.println(new LC191_NumberOf1Bits().hammingWeight(0b11111111111111111111111111111111));
    }

    /**
     * 解决方法来自
     * Integer.bitCount(int n);
     * https://blog.csdn.net/u013706904/article/details/89285482s
     */
    public int hammingWeight(int n) {
        // return Integer.bitCount(n >>> 16) + Integer.bitCount(n & 0x0000FFFF);

        // 0x5555_5555 = 0b0101_0101_0101_0101_0101_0101_0101_0101
        n = n - ((n >>> 1) & 0x5555_5555);
        // 0x3333_3333 = 0b0011_0011_0011_0011_0011_0011_0011_0011
        n = (n & 0x3333_3333) + ((n >>> 2) & 0x3333_3333);
        // 0x0f0f_0f0f = 0b0000_1111_0000_1111_0000_1111_0000_1111
        n = (n + (n >>> 4)) & 0x0f0f_0f0f;
        n = n + (n >>> 8);
        n = n + (n >>> 16);
        // 0x3f = 0b0011_1111
        return n & 0x3f;
    }
}
