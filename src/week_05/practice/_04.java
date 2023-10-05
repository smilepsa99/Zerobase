package week_05.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _04 {
    public static void main(String[] args) throws IOException {

        // 1. 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int[][] game = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                game[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2. 경우의 수 구하기

//        int[] pointer = {0, 0};
//        ArrayList<Integer[]> cache = new ArrayList<>();
//
//        // 2-1. 오른쪽으로 점프할 경우
//        int jump = game[pointer[0]][pointer[1]];
//        pointer[0] += jump;
//        if (pointer[0] > N-1) System.out.println(false);


    }
}
