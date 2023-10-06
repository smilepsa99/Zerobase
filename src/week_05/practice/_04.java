package week_05.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (참고함) https://hu-coding.tistory.com/36
public class _04 {
    public static void main(String[] args) throws IOException{

        // 1. 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int[][] game = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= N; j++) {
                game[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2. 경우의 수 구하기

        long[][] dp = new long[N+1][N+1];
        dp[1][1] = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int next = game[i][j];
                if (next == 0) break;
                if (j + next <= N) dp[i][j+next] += dp[i][j];
                if (i + next <= N) dp[i+next][j] += dp[i][j];
            }

            // +) dp 변화 확인
            // for(int l = 1; l <= N; l++){
            //     for(int m = 1; m <= N; m++){
            //         System.out.print(dp[l][m]+" ");
            //     }
            //     System.out.println();
            // }
            // System.out.println();
        }
        System.out.println(dp[N][N]);
    }
}
