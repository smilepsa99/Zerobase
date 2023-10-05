package week_05.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for (int i = N-1; i >= 0; i--) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        while (K > 0) {
            for (int i = 0; i < N; i++) {
                if (coins[i] > K) continue;
                count += K / coins[i];
                K %= coins[i];
            }
        }
        System.out.println(count);
    }
}
