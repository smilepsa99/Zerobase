package week_05.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _03 {
    public static void main(String[] args) throws IOException {

        // 1 (시간초과)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        int[] A = new int[N];
//        st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < A.length; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        int count = 0;
//        for (int i = 0; i < A.length - 1; i++) {
//            for (int j = i; j < A.length; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += A[k];
//                }
//                if (sum == M) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

        // 2
        // (참고함) https://code-lab1.tistory.com/276
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int s = 0; s < A.length; s++) {
            int sum = 0;
            for (int e = s; e < A.length; e++) {
                sum += A[e];
                if (sum == M) {
                    count++;
                } else if (sum > M) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}