package week_01;

// 백엔드스쿨 17기 박상아

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mini_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 진행할 투표수를 입력해주세요.");
        int total = sc.nextInt();
        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int count = sc.nextInt();
        String[] candidate = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print( i+1 + "번째 후보자이름을 입력해 주세요." );
            candidate[i] = sc.next();
        }
        System.out.println();

        int[] vote = new int[count];
        Arrays.fill(vote, 0);
        Random random = new Random();
        for (int i = 1; i <= total; i++) {
            int num = random.nextInt(count);
            System.out.printf("[투표진행률]: %.2f%%, %d명 투표 => %s\n",
                    (double) i / total * 100, i, candidate[num]);
            vote[num]++;
            for (int j = 0; j < count; j++) {
                System.out.printf("[기호:%d] %-7s\t%.2f%%\t(투표수: %d)\n",
                        j+1, candidate[j]+":", (double) vote[j] / total * 100, vote[j]);
            }
            System.out.println();
        }
        int max = vote[0];
        int maxIndex = 0;
        for (int i = 1; i < count; i++) {
            if (vote[i] > max) {
                max = vote[i];
                maxIndex = i;
            }
        }
        System.out.println("[투표결과] 당선인 : " + candidate[maxIndex]);
    }
}