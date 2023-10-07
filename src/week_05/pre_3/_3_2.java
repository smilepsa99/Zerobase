package week_05.pre_3;

import java.util.*;

public class _3_2 {
}

// 1
class Solution_3_2_1 {
    public int solution(String s, int n) {
        char c = (char) (n +'0');
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
        }
        return count;
    }
}


// 2
// import java.util.Arrays;
// import java.util.HashSet;
class Solution_3_2_2 {
    public Integer[] solution(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int n : arr1) set1.add(n);
        for (int n : arr2) set2.add(n);

        set1.retainAll(set2);
        Integer[] answer = set1.toArray(new Integer[0]);
        Arrays.sort(answer);
        return answer;
    }
}


// 3
class Solution_3_2_3 {
    public String solution(int[] arr, String prefix, String separator, String postfix) {
        StringBuilder answer = new StringBuilder();
        answer.append(prefix);
        for (int i = 0; i < arr.length; i++) {
            answer.append((arr[i]));
            if (i < arr.length - 1) {
                answer.append(separator);
            }
        }
        answer.append(postfix);
        return answer.toString();
    }
}


// 4
class Solution_3_2_4 {
    public boolean solution(boolean[][] matrix, boolean b) {
        boolean answer = true;
        int n = matrix.length;
        for (boolean[] booleans : matrix) {
            for (int i = 0; i < n; i++) {
                if (booleans[i] != b) {
                    answer = false;
                    break;
                }
            }
            if (!answer) break;
        }
        return answer;
    }
}


// 5
class Solution_3_2_5 {
    public boolean solution(boolean[][] matrix, boolean b) {
        boolean answer = true;
        int n = matrix.length;
        for (boolean[] booleans : matrix) {
            for (int i = 0; i < n; i++) {
                if (booleans[i] != b) {
                    answer = false;
                    break;
                }
            }
            if (!answer) break;
        }
        return answer;
    }
}