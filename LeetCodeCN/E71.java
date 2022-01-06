import java.util.*;

/**
 * https://leetcode-cn.com/problems/simplify-path/
 */
public class E71 {
    public static void main(String[] args) {
        System.out.println(new E71().simplifyPath("/home//foo/"));
    }

    public String simplifyPath(String path) {
        Deque<String> deque = new ArrayDeque<>();
        String[] pathArr = path.split("/");

        for (int i = 0; i < pathArr.length; i++) {
            switch (pathArr[i]) {
                case "":
                case ".":
                    break;
                case "..":
                    if (!deque.isEmpty()) {
                        deque.pop();
                    }
                    break;
                default:
                    deque.push(pathArr[i]);
                    break;
            }
        }


        StringBuffer stringBuffer = new StringBuffer();
        if (deque.isEmpty()){
            stringBuffer.append("/");
        }

        while (!deque.isEmpty()) {
            stringBuffer.append("/");
            stringBuffer.append(deque.pollLast());
        }
        return stringBuffer.toString();
    }
}
