import java.util.*;

public class E71_SimplifyPath {
    public static void main(String[] args) {
        // /home
        System.out.println(new E71_SimplifyPath().simplifyPath("/home/"));
        // /
        System.out.println(new E71_SimplifyPath().simplifyPath("/../"));
        // /home/foo
        System.out.println(new E71_SimplifyPath().simplifyPath("/home//foo/"));
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
        if (deque.isEmpty()) {
            stringBuffer.append("/");
        }

        while (!deque.isEmpty()) {
            stringBuffer.append("/");
            stringBuffer.append(deque.pollLast());
        }
        return stringBuffer.toString();
    }
}
