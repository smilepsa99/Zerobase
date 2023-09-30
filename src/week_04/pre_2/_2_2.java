package week_04.pre_2;

import java.util.ArrayList;
import java.util.HashMap;

public class _2_2 {
}

// 1
class Solution_2_2_1 {
    public int solution(int[] useageArr, int fee) {
        int sum = 0;
        for (int n : useageArr) {
            sum += n;
        }
        int answer = sum * fee;
        return answer;
    }
}

// 2
// import java.util.ArrayList;
class Solution_2_2_2 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : arr) {
            if (a % 2 != 0) {
                list.add(a); list.add(a);
            } else {
                list.add(a);
            }
        }
        int[] answer = new int[arr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

// 3
class Solution_2_2_3 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 100000000; i++) {
            if (Math.pow(i, 3) <= n) {
                answer = (int) Math.pow(i, 3);
            } else {
                break;
            }
        }
        return answer;
    }
}

// 4
// import java.util.HashMap;
class Solution_2_2_4 {
    public int solution(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        int answer = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                answer = key;
            }
        }
        return answer;
    }
}

// 5
class Solution_2_2_5 {
    public int solution(int num) {
        boolean minus = false;
        if (num < 0) {
            num *= -1;
            minus = true;
        }

        String s = String.valueOf(num);
        String[] parts = s.split("");
        String temp = "";
        for (int i = parts.length - 1; i >= 0; i--) {
            if (i == parts.length - 1 && "-".equals(parts[0])) {
                continue;
            }
            temp += parts[i];
        }

        int answer = 0;
        if (minus) {
            answer = (-1) * Integer.parseInt(temp);
        } else {
            answer = Integer.parseInt(temp);
        }

        if (answer >= 100000 || answer <= -100000) {
            answer = 0;
        }

        return answer;
    }
}