package week_03._1;
// [프로그래머스] 짝수는 싫어요

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = (n % 2 == 0) ? n/2 : n/2 + 1;
        int[] answer = new int[size];
        int index = 0;
        for (int i = 1; i <= n; i += 2, index += 1) {
            answer[index] = i;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
