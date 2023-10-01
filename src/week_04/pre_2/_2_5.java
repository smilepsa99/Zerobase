package week_04.pre_2;

import java.util.*;

public class _2_5 {
}

// 1
class Solution_2_5_1 {
    public int solution(String sentence, String word) {
        String[] arr = sentence.split(" ");
        int answer = -1;
        for (int i = 0; i < arr.length; i++) {
            if (word.equals(arr[i])) {
                answer = i;
                break;
            }
        }

        if (sentence.length() == 0) {
            answer = -1;
        }
        return answer;
    }
}

// 2
class Solution_2_5_2 {
    public int solution(int[] nums, int n) {
        int answer = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

// 3
// import java.util.ArrayList;
// import java.util.Collections;
class Solution_2_5_3 {
    public int solution(int[] cards) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int card : cards) {
            list.add(card);
        }

        while (list.size() > 1) {
            Collections.sort(list);
            int c1 = list.get(list.size() - 1);
            int c2 = list.get(list.size() - 2);

            if (c1 != c2) {
                list.add(Math.abs(c1 - c2));
            }
            list.remove(Integer.valueOf(c1));
            list.remove(Integer.valueOf(c2));
        }

        int answer = (list.size() == 0) ? 0 : list.get(0);
        return answer;
    }
}

// 4
class Solution_2_5_4 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += (int) (Math.pow(2, i) % 1000000007);
            answer %= 1000000007;
        }
        return answer % 1000000007;
    }
}

// 5
// import java.util.Arrays;
class Solution_2_5_5 {
    public String solution(int[] arr) {
        String answer = "NO";
        if (arr.length > 1 && arr[0] == 0) {
            int root = arr[1];
            Arrays.sort(arr);
            if (arr[1] == root) {
                answer = "YES";
            }
        }
        return answer;
    }
}