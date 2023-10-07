package week_05.pre_3;

import java.util.ArrayList;
public class _3_4 {
}

// 1 (실패)
class Solution_3_4_1 {
    public int solution(int n, int k) {
        int[] nums = new int[k];
        for (int i = 0, j = k; i < k; i++, j--) {
            nums[i] = j;
        }

        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            if (nums[i] < n) {
                sum += nums[i];
                n -= nums[i];
                if (sum == n) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}


// 2
class Solution_3_4_2 {
    public int solution(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum < 0) {
                    break;
                } else if (sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}


// 3
// import java.util.ArrayList;
class Solution_3_4_3 {
    public int[][] solution(int[][] n) {
        int h = n.length;
        int w = n[0].length;

        int[][] dp = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                dp[i][j] = -1;
            }
        }


        ArrayList<Integer[]> bus = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (n[i][j] == 0) {
                    Integer[] tmp = {i, j};
                    bus.add(tmp);
                }
            }
        }

        for (Integer[] arr : bus) {
            int x = arr[0];
            int y = arr[1];

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int distance = Math.abs(x - i) + Math.abs(y - j);
                    if (distance == 0) {
                        dp[i][j] = 0;
                        continue;
                    }
                    if (dp[i][j] == -1 || distance < dp[i][j]) {
                        dp[i][j] = distance;
                    }
                }
            }
        }
        return dp;
    }
}


// 4
class Solution_3_4_4 {
    public int solution(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    break;
                } else {
                    count++;
                    if (count > max) max = count;
                }
            }
        }
        return max;
    }
}


// 5
class Solution_3_4_5 {
    public boolean solution(int[] bridge, int jumpSize) {
        boolean answer = true;
        for (int i = 0; i < bridge.length; i++) {
            int count = 0;
            for (int j = i; j < bridge.length; j++) {
                if (bridge[j] == 1) {
                    break;
                } else {
                    count++;
                    if (count > jumpSize) answer = false;
                }
            }
        }
        return answer;
    }
}