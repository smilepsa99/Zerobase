package week_06;

import java.util.Arrays;

public class Monthly_Exam_10 {
    public static void main(String[] args) {
        
        // 1 (100/100)
        int N = 5;
        int K = 4;
        int[] arr = {7, 2, 3, 5, 2};
        int[][] queries = {{1, 100}, {3, 5}, {2, 2}, {9, 10}}; // {5, 2, 2, 0}

        int[] answer = new int[K];
        int index = 0;
//        for (int[] query : queries) {
//            int count = 0;
//            for (int n : arr) {
//                if (query[0] <= n && n <= query[1]) count++;
//            }
//            answer[index++] = count;
//        }

        Arrays.sort(arr); // 2, 2, 3, 5, 7 // 2, 4, 5, 6, 7 {1, 1}
//        for (int[] query : queries) {
//            int count = 0;
//            if (query[0] <= arr[0] && arr[N-1] <= query[1]) {
//                answer[index++] = N;
//                continue;
//            }
//            for (int n : arr) {
//                if (query[0] <= n && n <= query[1]) count++;
//            }
//            answer[index++] = count;
//        }

        for (int[] query : queries) {
            if (query[0] <= arr[0] && arr[N-1] <= query[1]) {
                answer[index++] = N;
                continue;
            }

            int start = -1, end = -1;
            for (int i = 0; i < N; i++) {
                if (arr[i] >= query[0]) {
                    start = i;
                    break;
                }
            }
            for (int i = N-1; i >= 0; i--) {
                if (arr[i] <= query[1]) {
                    end = i;
                    break;
                }
            }
            answer[index++] = (start == -1 || end == -1) ? 0 : end - start + 1;
        }

        // 출력
        System.out.print("{");
        for (int i = 0; i < K; i++) {
            System.out.print(answer[i]);
            if (i < K - 1) System.out.print(", ");
        }
        System.out.println("}");
        
//----------------------------------------------------------------------------------------------//
        // 2 (100/100)
        N = 6;
        int[][] house = {{0, 0, 0, 0, 0, 0},
                {0, 4, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 3, 0, 0, 0, 0}}; // 18



        int[][] sibling = new int[5][2]; // 형제(1~4)의 좌표들을 저장하는 2차원 배열
        // {{1, 1}, {4, 4}, {2, 3}, {5, 1}, {1, 1}}

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (house[i][j] > 0) {
                    sibling[house[i][j]][0] = i;
                    sibling[house[i][j]][1] = j;
                    if (house[i][j] == 4) {
                        sibling[0][0] = i;
                        sibling[0][1] = j;
                    }
                }
            }
        }

        int answer2 = 0;
        for (int i = 0; i < sibling.length - 1; i++) {
            int y = Math.abs(sibling[i][0] - sibling[i+1][0]);
            int x = Math.abs(sibling[i][1] - sibling[i+1][1]);
            answer2 += x + y;
        }



        // 출력
//        for (int i = 0; i < sibling.length; i++) {
//            for (int j = 0; j < sibling[i].length; j++) {
//                System.out.print(sibling[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(answer2);

//----------------------------------------------------------------------------------------------//
        // 3 (0/100) : 못 품
    }
}