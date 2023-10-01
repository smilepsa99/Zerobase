package week_04.pre_2;

import java.util.*;

public class _2_4 {
}

// 1
class Solution_2_4_1 {
    public int solution(int N, int K) {
        String tmp = "";
        int count = 0;
        for (int i = 1; i <= N; i++) {
            tmp = String.valueOf(i);
            for (int j = 0; j < tmp.length(); j++) {
                String s = String.valueOf(tmp.charAt(j));
                if (s.equals(String.valueOf(K))) {
                    count++;
                }
            }
        }
        return count;
    }
}

// 2
// import java.util.ArrayList;
// import java.util.Comparator;
class Solution_2_4_2 {
    public int solution(int[] A, int K) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : A) {
            list.add(i);
        }
        list.sort(Comparator.reverseOrder());
        System.out.println(list); // 5 4 3 2 1

        int tmp = 0, count = 0;
        String answer = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                count++;
                if (count == K) {
                    answer = String.valueOf(list.get(i)) + String.valueOf(list.get(j));
                }
            }
        }
        return Integer.parseInt(answer);
    }
}

// 3
// import java.util.ArrayList;
class Solution_2_4_3 {
    public int solution(String S1, String S2) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i < S1.length() - 1; i++) {
            String s1 = S1.substring(0, i);
            String s2 = S1.substring(i);

            String tmp = s2 + s1;
            if (tmp.equals(S2)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}

// 4
// import java.util.HashMap;
class Solution_2_4_4 {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        int count = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                for (int i = 1; i < map.get(key); i++) {
                    count += i;
                }
            }
        }
        return count;
    }
}

// 5
class Solution_2_4_5 {
    public int solution(String[] array, String s) {
        int count = 0;
        for (String a : array) {
            if (s.contains(a) && s.indexOf(a) == 0) {
                count++;
            }
        }
        return count;
    }
}