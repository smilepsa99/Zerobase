package week_05.pre_3;

import java.util.HashMap;
import java.util.HashSet;

public class _3_1 {
    public static void main(String[] args) {
        // int[] arr = {1, 3, 5, 4, 3, 1, 1}; // false
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}; // true

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        HashSet<Integer> set = new HashSet<>(map.values());
        if (map.values().size() == set.size()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
