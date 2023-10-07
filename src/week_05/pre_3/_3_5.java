package week_05.pre_3;

import java.util.*;
public class _3_5 {
}

// 1
class Solution_3_5_1 {
    public int solution(int n) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i-1] = i;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == n) {
                    count++;
                    break;
                } else if (sum > n) break;
            }
        }
        return count;
    }
}


// 2
class Solution_3_5_2 {
    public int solution(int N, int K) {
        String n = (N >= 0) ? String.valueOf(N) : String.valueOf(N * (-1));
        String ans = "";
        boolean in = false;

        if (N >= 0) {
            for (int i = 0; i < n.length(); i++) {
                int num = n.charAt(i) - '0';
                if (num < K && !in) {
                    ans += String.valueOf(K) + String.valueOf(num);
                    in = true;
                } else {
                    ans += String.valueOf(num);
                    if (i == n.length()-1 && !in) ans += String.valueOf(K);
                }
            }
        } else {
            for (int i = 0; i < n.length(); i++) {
                int num = n.charAt(i) - '0';
                if (num > K && !in) {
                    ans += String.valueOf(K) + String.valueOf(num);
                    in = true;
                } else {
                    ans += String.valueOf(num);
                    if (i == n.length()-1 && !in) ans += String.valueOf(K);
                }
            }
        }

        int answer = N >= 0 ? Integer.parseInt(ans) : Integer.parseInt(ans) * (-1);
        return answer;
    }
}


// 3 (실패)


// 4
// import java.util.Arrays;
class Solution_3_5_4 {
    public int solution(int[] A, int K) {
        Arrays.sort(A);
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0, count = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum > K) break;
                count++;
                if (count > max) max = count;
            }
        }
        return max;
    }
}


// 5
// import java.util.ArrayList;
class Solution_3_5_5 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int a : arr) arrList.add(a);
        ArrayList<Integer> ans = new ArrayList<>();

        int bill = 0, skip = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 500) {
                bill = arr[i];
                skip = i;
            }
        }
        if (bill > 0) {
            ans.add(bill);
            arrList.remove(arrList.get(skip));
        }

        int sum = 0;
        for (int a : arrList) {
            sum += a;
        }

        int[] coins = {500, 100, 50, 10};
        for (int coin : coins) {
            if (coin <= sum) {
                int count = sum / coin;
                for (int j = 0; j < count; j++) {
                    ans.add(coin);
                }
                sum %= coin;
                if (sum == 0) break;
            }
        }

        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}