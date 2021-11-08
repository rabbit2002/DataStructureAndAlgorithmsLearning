import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E412 {
    public static void main(String[] args) {
        int q1 = 15;
        List<String> a1 = new E412().fizzBuzz(q1);
        System.out.println(a1);


    }

    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>(n);
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                stringBuffer.append("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                stringBuffer.append("Fizz");
            } else if ((i + 1) % 5 == 0) {
                stringBuffer.append("Buzz");
            } else {
                stringBuffer.append(i + 1);
            }
            res.add(stringBuffer.toString());
            stringBuffer.setLength(0);
        }
        return res;
    }
}
