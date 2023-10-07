package week_05.pre_3;

import java.util.*;

public class _3_1 {
}

// 1
// import java.util.HashMap;
// import java.util.HashSet;
class Solution_3_1_1 {
    public boolean solution(int[] arr) {
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
            return true;
        } else {
            return false;
        }
    }
}


// 2
// import java.util.Arrays;
class Solution_3_1_2 {
    public int solution(int[] arr) {
        int[] ranking = new int[arr.length];
        Arrays.sort(arr);
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            ranking[j] = arr[i];
        }

        int count = 0;
        int cut = ranking[arr.length / 2 - 1];
        for (int score : ranking) {
            if (score >= cut) count++;
        }
        return count;
    }
}


// 3 (실패)
class Solution_3_1_3 {
    public int solution(int n) {
        int start = (int) Math.pow(10, n-1);
        int end = (int) Math.pow(10, n);

        long count = 0;
        for (int i = start; i < end; i++) {
            String s = String.valueOf(i);
            if (isPalin(s)) count++;
        }
        count %= 1000000007;
        return (int) count;
    }

    public static boolean isPalin(String s) {
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            if (i >= s.length()-1-i) return true;
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                check = false;
                break;
            }
        }
        return check;
    }
}


// 4 (실패)


// 5
class Solution_3_1_5 {
    public int solution(int n, int price) {
        int cost = (n / 11 * 10 + (n % 11)) * price;
        return cost;
    }
}