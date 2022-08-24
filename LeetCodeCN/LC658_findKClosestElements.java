import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LC658_findKClosestElements {
    public static void main(String[] args) {
        System.out.println(new LC658_findKClosestElements().findClosestElements(new int[] { 1, 2, 3, 4, 5 }, 4, 3));
        System.out.println(new LC658_findKClosestElements().findClosestElements(new int[] { 1, 2, 3, 4, 5 }, 4, -1));
        System.out.println(new LC658_findKClosestElements().findClosestElements(new int[] { 1, 2, 3, 4, 5 }, 4, 6));
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // 转为 list
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Collections.sort(list, (a, b) -> {
            if (Math.abs(a - x) != Math.abs(b - x)) {
                return Math.abs(a - x) - Math.abs(b - x);
            } else {
                return a - b;
            }
        });

        list = list.subList(0, k);
        Collections.sort(list);
        return list;
    }
}
