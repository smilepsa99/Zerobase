package week_05.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _02 {
    public static void main(String[] args) throws IOException {

        // 1 (시간초과)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int len1 = Integer.parseInt(st.nextToken());
//        int len2 = Integer.parseInt(st.nextToken());
//
//        int[][] arr = new int[len1][len2];
//
//        for (int i = 0; i < len1; i++) {
//            String s1 = br.readLine();
//            String[] nums1 = s1.split(" ");
//            for (int j = 0; j < len2; j++) {
//                arr[i][j] = Integer.parseInt(nums1[j]);
//            }
//        }
//        int k = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < k; i++) {
//            int sum = 0;
//            String s2 = br.readLine();
//            String[] nums2 = s2.split(" ");
//
//            for (int j = Integer.parseInt(nums2[0])-1; j < Integer.parseInt(nums2[2]); j++) {
//                for (int l = Integer.parseInt(nums2[1])-1; l < Integer.parseInt(nums2[3]); l++) {
//                    sum += arr[j][l];
//                }
//            }
//            System.out.println(sum);
//        }

        // 2
        // (참고함) https://dev-coco.tistory.com/150
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int k = Integer.parseInt(br.readLine());

        while (k-- > 0) {
            int sum = 0;

            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int l = i-1; l < x ; l++) {
                for (int m = j-1; m < y; m++) {
                    sum += arr[l][m];
                }
            }

            System.out.println(sum);
        }
    }
}
