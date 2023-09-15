package week_01;

// 백엔드스쿨 17기 박상아

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;

public class mini_07 {
    public static void main(String[] args) {
        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해주세요. (숫자 1 ~ 10):");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        // 1. 로또 번호 생성
        Random random = new Random();
        int[][] nums = new int[count + 1][6];
        for (int i = 0; i < count + 1; i++) {
            int index = 0;
            while (index < 6) {
                int num = random.nextInt(45) + 1;
                if (IntStream.of(nums[i]).noneMatch(x -> x == num)) {
                    nums[i][index++] = num;
                }
            }
            Arrays.sort(nums[i]);
        }
        int A = 65;
        for (int i = 0; i < count; i++) {
            System.out.printf("%c\t", (char)A++);
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%02d", nums[i][j]);
                if (j < nums[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }

        // 2. 로또 당첨 발표
        System.out.println("\n[로또 발표]");
        int[] winning = nums[count];
        System.out.print(" \t");
        for (int i = 0; i < winning.length; i++) {
            System.out.printf("%02d", winning[i]);
            if (i < winning.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        // 3. 로또 결과 안내
        System.out.println("\n[내 로또 결과]");
        A = 65;
        for (int i = 0; i < count; i++) {
            int same = 0;
            System.out.printf("%c\t", (char)A++);
            for (int j = 0; j < nums[i].length; j++) {
                int n = nums[i][j];
                System.out.printf("%02d", n);
                if (j < nums[i].length - 1) { System.out.print(","); }
                if (IntStream.of(winning).anyMatch(x -> x == n)) { same++; }
            }
            System.out.println(" => " + same + "개 일치");
        }
    }
}