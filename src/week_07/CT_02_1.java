package week_07;

import java.util.ArrayList;
import java.util.Arrays;

public class CT_02_1 {
    public static void main(String[] args) {
        //int[] numbers = {9, 4, 2, 3, 7, 5}; // 6
        int[] numbers = {26, 62, 34, 52, 15, 17, 16, 20, 19, 18}; // 21


        // 1
        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : numbers) {
            list.add(n);
        }

        int min = numbers[0];
        int max = numbers[numbers.length - 1];

        int answer = 0;
        for (int i = min; i <= max; i++) {
            if (!list.contains(i)) {
                 answer = i;
                 break;
            }
        }

        System.out.println("return " + answer);


        // 2
    }
}
