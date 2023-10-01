package week_04.pre_2;

import java.util.*;
public class _2_3 {
}

// 1
// import java.util.*;
class Solution_2_3_1 {
    public String solution(String s) {
        String[] nums = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        List<Integer> keyList = new ArrayList<>();
        for (String key : map.keySet()) {
            keyList.add(Integer.parseInt((key)));
        }
        List<Integer> none = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            none.add(i);
        }
        none.removeAll(keyList);

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        String answer = "";
        for(Map.Entry<String, Integer> entry : entryList){
            answer += entry.getKey() + " ";
        }
        for (int i = 0; i < none.size(); i++) {
            answer += none.get(i);
            if (i < none.size() - 1) {
                answer += " ";
            }
        }
        return answer;
    }
}

// 2
// import java.util.ArrayList;
class Solution_2_3_2 {
    public int[] solution(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int n : nums) {
            list1.add(n);
        }
        for (int i = 1; i <= nums.length; i++) {
            list2.add(i);
        }

        list2.removeAll(list1);
        int[] answer = new int[list2.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list2.get(i);
        }
        return answer;
    }
}

// 3 (못 품)

// 4
class Solution_2_3_4 {
    public int solution(int A, int B) {
        String s = Integer.toBinaryString(A ^ B);
        int count = 0;
        String[] nums = s.split("");
        for (String n : nums) {
            if ("1".equals(n)) {
                count++;
            }
        }
        return count;
    }
}

// 5
// import java.util.ArrayList;
class Solution_2_3_5 {
    public int solution(int N, int K) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int pointer = 0;
        while (list.size() > 1) {
            pointer += K - 1;
            if (pointer >= list.size()) {
                pointer %= list.size();
            }
            list.remove(pointer);
        }
        return list.get(0);
    }
}
