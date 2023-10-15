package week_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mission1_hw2 {
    public static void main(String[] args) {
        int[] myPoint = makePoint("내 ");

        ArrayList<int[]> points = new ArrayList<>();
        int len = 10;
        while (points.size() < len) {
            System.out.printf("%d/%d 번째 입력\n", points.size() + 1, len);
            int[] point = makePoint("임의의 ");
            if (isContain(point, points)) {
                System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해주세요.");
            } else {
                points.add(point);
            }
        }

        double[] diffs = new double[len];
        double min = -1;
        for (int i = 0; i < points.size(); i++) {
            int a = Math.abs(myPoint[0]-points.get(i)[0]);
            int b = Math.abs(myPoint[1]-points.get(i)[1]);
            diffs[i] = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.printf("(%d, %d) => %f\n", points.get(i)[0], points.get(i)[1], diffs[i]);
            if (min == -1 || diffs[i] <= min) {
                min = diffs[i];
            }
        }

        System.out.println("제일 가까운 좌표:");
        for (int i = 0; i < diffs.length; i++) {
            if (diffs[i] == min) {
                System.out.printf("(%d, %d) => %f\n", points.get(i)[0], points.get(i)[1], diffs[i]);
            }
        }

    }

    public static int[] makePoint(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println(s + "좌표 x값을 입력해 주세요.");
        int x = sc.nextInt();
        System.out.println(s + "좌표 y값을 입력해 주세요.");
        int y = sc.nextInt();
        int[] newPoint = {x, y};
        return newPoint;
    }

    public static boolean isContain(int[] point, ArrayList<int[]> points) {
        for (int[] arr : points) {
            if (Arrays.equals(arr, point)) return true;
        }
        return false;
    }
}