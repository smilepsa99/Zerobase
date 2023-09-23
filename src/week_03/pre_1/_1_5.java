package week_03.pre_1;

import java.util.*;

public class _1_5 {
}

// 1
// import java.util.*;

class Solution1_5_1 {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr);

        HashMap<String, Integer> counts = new HashMap<>();
        for (String a : arr) {
            if (counts.containsKey(a)) {
                counts.put(a, counts.get(a) + 1);
            } else {
                counts.put(a, 1);
            }
        }

        int max = 0;
        for (Integer value : counts.values()) {
            if (value > max) {
                max = value;
            }
        }

        String answer = "";
        for (String key : counts.keySet()) {
            if (counts.get(key) == max) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}

// 2
class Solution1_5_2 {
    public boolean solution(int n) {
        boolean answer = true;
        int range = (int) Math.sqrt(n);
        for (int i = 2; i < range; i++) {
            if (n % i == 0) {
                answer = false;
            }
        }
        return answer;
    }
}

// 3
class Solution1_5_3 {
    public String solution(String s) {
        String answer = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            answer += s.charAt(i);
        }
        return answer;
    }
}

// 4
class Solution1_5_4 {
    public int solution(int n) {
        int answer = 0;
        if (Math.sqrt(n) == (int)Math.sqrt(n)) {
            answer = (int)Math.sqrt(n);
        }
        return answer;
    }
}

// 5
class Solution1_5_5 {
    public String solution(String s) {
        char[] parts = s.toCharArray();
        String answer = "";
        for (char c : parts) {
            if (Character.isUpperCase(c)) {
                answer += (String.valueOf(c)).toLowerCase();
            } else if (Character.isLowerCase(c)) {
                answer += (String.valueOf(c)).toUpperCase();
            }
        }
        return answer;
    }
}