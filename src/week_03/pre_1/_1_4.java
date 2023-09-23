package week_03.pre_1;

import java.util.ArrayList;

public class _1_4 {
}

// 1
class Solution1_4_1 {
    public String solution(int[] arr) {
        String answer = "";
        for (int num : arr) {
            answer += (char) num;
        }
        return answer;
    }
}

// 2
class Solution1_4_2 {
    public int solution(String[] arr) {
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i], 2);
        }

        int answer = nums[0];
        for (int i = 1; i < nums.length; i++) {
            answer ^= nums[i];
        }
        return answer;
    }
}

// 3
// import java.util.ArrayList;
class Solution1_4_3 {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        if (n > 1) list.add(n);
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        return list.size();
    }
}

// 4
class Solution1_4_4 {
    public String solution(String s) {
        int temp = Integer.parseInt(s, 16);
        String answer = Integer.toBinaryString(temp);
        return answer;
    }
}

// 5
class Solution1_4_5 {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
            if (i < arr.length - 1) answer += ",";
        }
        return answer;
    }
}