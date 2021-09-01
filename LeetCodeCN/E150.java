import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 *
 * @author RABBIT2002
 * @date 2021/3/20
 */
public class E150 {
    public static void main(String[] args) {
        System.out.println(new E150().evalRPN(new String[]{"0", "3", "/"}));
        System.out.println(new E150().evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(new E150().evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        System.out.println(new E150().evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    /**
     * 后缀表达式
     * 1. 凡是数字压栈
     * 2. 凡是操作符就弹出两个数字
     * 3. 操作完之后立即压栈
     */
    public int evalRPN(String[] tokens) {
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            // 数字
            if (tokens[i].length() == 1 && tokens[i].charAt(0) - 48 >= 0 || tokens[i].length() > 1) {
                stringStack.push(tokens[i]);
            }
            // 运算符 +43 -45 *42 /47
            else {
                int y = Integer.parseInt(stringStack.pop());
                int x = Integer.parseInt(stringStack.pop());
                int result = -1;
                switch (tokens[i]) {
                    case "+":
                        result = x + y;
                        break;
                    case "-":
                        result = x - y;
                        break;
                    case "*":
                        result = x * y;
                        break;
                    case "/":
                        result = x / y;
                        break;
                }
                stringStack.push(String.valueOf(result));
            }
        }
        return Integer.parseInt(stringStack.pop());
    }
}
