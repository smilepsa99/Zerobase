package week_03.practice;
// 실패 (비트연산 비튼게 이해가 잘 안되서 포기함)

import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        // [1] 시간초과
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                answer += nums[i] ^ nums[j];
            }
        }
        System.out.println(answer);

//        // [2] 시간초과
//        // [참고] 조합 구현 https://velog.io/@realhsb/Combination
//        Scanner sc = new Scanner(System.in);
//        int len = sc.nextInt();
//        int[] nums = new int[len];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = sc.nextInt();
//        }
//        boolean[] check = new boolean[len];
//        int answer = value(nums, check, 0, 0, len, 2);
//        System.out.println(answer);

        // [3]
        // 다른사람 풀이 https://velog.io/@wellsbabo/%ED%96%89%EC%84%B1-X3%EB%B0%B1%EC%A4%802830%EB%B2%88

    }
//
//    public static int value(int[] arr, boolean[] visited, int sum, int start, int n, int r) {
//        if (r == 0) {
//            int[] temp = new int[2];
//            int index = 0;
//            for (int i = 0; i < visited.length; i++) {
//                if (visited[i]) {
//                    temp[index++] = arr[i];
//                }
//            }
//            sum += temp[0] ^ temp[1];
//            return sum;
//        }
//
//        for (int i = start; i < n; i++) {
//            visited[i] = true;
//            sum = value(arr, visited, sum, i + 1, n, r - 1);
//            visited[i] = false;
//        }
//        return sum;
//    }
}
