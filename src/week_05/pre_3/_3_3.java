package week_05.pre_3;

import java.util.*;
public class _3_3 {
}

// 1
// import java.util.Arrays;
class Solution_3_3_1 {
    public int solution(int[] arr, int n) {
        Arrays.sort(arr);
        int answer = -1;
        for (int num : arr) {
            if (num >= n) {
                answer = num;
                break;
            }
        }
        return answer;
    }
}


// 2
// import java.util.ArrayList;
// import java.util.Collections;
class Solution_3_3_2 {
    public int solution(int[] people, int limit) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int p : people) list.add(p);
        Collections.sort(list);

        int answer = 0;
        boolean check = false;
        while (true) {
            for (int i = 1; i < list.size(); i++) {
                check = false;
                if (list.get(0) + list.get(list.size() - i) <= limit) {
                    check = true;
                    list.remove(list.get(0));
                    list.remove(list.get(list.size() - i));
                    answer++;
                }
            }
            if (!check || list.size() == 0) {
                answer += list.size();
                break;
            }
        }
        return answer;
    }
}


// 3
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
class Solution_3_3_3 {
    public int solution(int[] A) {
        Arrays.sort(A);
        ArrayList<Integer> Alist = new ArrayList<>();
        for (int a : A) Alist.add(a);

        int mid = Alist.size() / 2;
        ArrayList<Integer> less = new ArrayList<>(Alist.subList(0, mid));
        Collections.reverse(less);
        ArrayList<Integer> more = new ArrayList<>(Alist.subList(mid, Alist.size()));

        int answer = 0;
        for (int i = 0; i < more.size(); i++) {
            answer += more.get(i) * (2 * i + 1);
        }
        for (int i = 0; i < less.size(); i++) {
            answer -= less.get(i) * (2 * i + 2);
        }
        return answer;
    }
}


// 4
// import java.util.ArrayList;
class Solution_3_3_4 {
    public int solution(int A) {
        ArrayList<Integer> coin = new ArrayList<>();
        for (int i = 4; i >= 0; i--) {
            int n = (int) Math.pow(10, i);
            coin.add(5 * n);
            coin.add(n);
        }

        int answer = 0;
        for (int c : coin) {
            if (c > A) {
                continue;
            }
            answer += A / c;
            A %= c;
        }
        return answer;
    }
}


// 5 (실패)
class Solution_3_3_5 {
    public int solution(int[] fruits) {
        int max = 0;
        for (int i = 0; i < fruits.length; i++) {
            int sum = 0;
            for (int j = i; j < fruits.length; j++) {
                sum += fruits[j];
                if (sum < 0) break;
            }
            if (sum > max) max = sum;
        }
        return max;
    }
}