package week_03.pre_1;

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.HashMap;

public class _1_1 {
}

// 1
class Solution1_1_1 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += i;
        }
        return answer;
    }
}

// 2
class Solution1_1_2 {
    public boolean solution(int num) {
        boolean answer = ((num-1) % 4 != 0) ? true : false;
        return answer;
    }
}

// 3
// import java.util.ArrayList;
// import java.util.Collections;

class Solution1_1_3 {
    public int solution(int[] A) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j < A.length; j++) {
                int earn = A[j] - A[i];
                if (earn > 0) {
                    list.add(earn);
                }
            }
        }
        int max = (list.size() == 0) ? 0 : Collections.max(list);
        return max;
    }
}

// 4
class Solution1_1_4 {
    public int solution(String s) {
        String[] nums = s.split("");
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (String str : nums) {
            int n = Integer.parseInt(str);
            if (counts.containsKey(n)) {
                counts.put(n, counts.get(n) + 1);
            } else {
                counts.put(n, 1);
            }
        }
        int max = Collections.max(counts.values());
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer key : counts.keySet()) {
            if (counts.get(key) == max) {
                list.add(key);
            }
        }
        return Collections.min(list);
    }
}

// 5
class Solution1_1_5 {
    public int solution(String S) {
        int num = Integer.parseInt(S, 2);
        int count = 0;
        while (num > 0) {
            num = (num % 2 == 0) ? (num / 2) : (num - 1);
            count++;
        }
        return count;
    }
}