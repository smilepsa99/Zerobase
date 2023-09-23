package week_03.pre_1;

import java.util.LinkedList;
import java.util.Queue;
import java.lang.StringBuffer;
import java.util.ArrayList;
import java.util.Arrays;

public class _1_2 {
//    // Solution1_2_1 실행코드
//    public static void main(String[] args) {
//        Solution1_2_1 s = new Solution1_2_1();
//        for (int i = 0; i <= 1000; i++) {
//            System.out.println(s.solution(5, "Snowball", i));
//        }
//    }
}

// 1 (실패)
// [참고] 다른 전광판 문제 풀이 https://blog.naver.com/hong227/221391673310
// [참고] Queue https://cocoon1787.tistory.com/774

//import java.util.LinkedList;
//import java.util.Queue;
class Solution1_2_1 {
    public String solution(int n, String s, int t) {
        StringBuilder answer = new StringBuilder();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(".");
        }
        for (int j = 0; j < t % (n + s.length()); j++) {
            queue.poll();
            queue.offer(j < s.length() ? s.substring(j, j + 1) : ".");
        }

        for (String str : queue) {
            answer.append(str);
        }
        return answer.toString();
    }
}

// 2

// import java.lang.StringBuffer;
// import java.util.ArrayList;
class Solution1_2_2 {
    public ArrayList<String> solution(String s) {
        String[] strings = s.split("\\.|,|!|\\?| ");
        // ㄴ String[] strings = s.split("[.,!? ]"); → 이렇게도 됨
        for (int i = 0; i < strings.length; i++) {
            StringBuffer sb = new StringBuffer(strings[i]);
            strings[i] = sb.reverse().toString();
        }
        ArrayList<String> list = new ArrayList<>();
        for (String string : strings) {
            if (!"".equals(string)) {
                list.add(string);
            }
        }
        return list;
    }
}

// 3

// import java.util.Arrays;
class Solution1_2_3 {
    public int solution(int[] A) {
        Arrays.sort(A);
        int max = 1;
        for (int i = 2; i <= A[A.length-1]; i++) {
            boolean check = true;
            for (int j = 0; j < A.length; j++) {
                if (A[j] %  i != 0) {
                    check = false;
                }
            }
            if (check) {
                max = i;
            }
        }
        return max;
    }
}

// 4

// import java.util.Arrays;
class Solution1_2_4 {
    public int solution(int[] orders, int n) {
        int count = 0, answer = 0;
        for (int i = 1; i <= 1001; i++) {
            if (Arrays.binarySearch(orders, i) < 0) {
                answer = i;
                count++;
                if (count == n) {
                    break;
                }
            }
        }
        return answer;
    }
}

// 5

class Solution1_2_5 {
    public int solution(int[] arr) {
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
