package week_05.pre_3;

import java.util.Arrays;

public class _3_2 {
    public static void main(String[] args) {
        int[] arr = {95, 90, 95, 100, 95}; // 4
        // int[] arr = {0, 0, 0, 0, 0}; // 5
        // int[] arr = {2, 1, 3, 4, 5}; // 2


        int[] ranking = new int[arr.length];
        Arrays.sort(arr);
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            ranking[j] = arr[i];
        }

        int count = 0;
        int cut = ranking[arr.length / 2 - 1];
        for (int score : ranking) {
            if (score >= cut) count++;
        }
        System.out.println(count);
    }
}
