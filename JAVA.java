import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 5, 5, 36, 36, 37, 36};
        Map<Integer, Integer> map = new HashMap<>();

        for (int element : array) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        System.out.println(map);
    }
}
