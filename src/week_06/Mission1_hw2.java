package week_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Mission1_hw2 {
    public static void main(String[] args) {
        System.out.println("[1단계] 나의 좌표를 입력해주세요");
        int[] myPoint = makePoint();

        System.out.println("[2단계] 임의의 좌표를 입력해주세요");
        ArrayList<Integer> x_list = new ArrayList<>();
        ArrayList<Integer> y_list = new ArrayList<>();
        ArrayList<int[]> points = new ArrayList<>();
        int len = 10;
        while (points.size() < len) {
            int[] point = makePoint();
            int x = point[0], y = point[1];
            if (x_list.contains(x) && y_list.contains(y)) {
                System.out.println("중복된 좌표입니다. 다시 입력해주세요");
            } else {
                x_list.add(x);
                y_list.add(y);
                points.add(point);
                System.out.printf("(%d, %d)가 입력됐습니다.[%d/10]\n", x, y, points.size());
            }
        }

        int[] diffs = new int[len];
        int min = -1;
        for (int i = 0; i < points.size(); i++) {
            diffs[i] = Math.abs(myPoint[0]-points.get(i)[0])
                    + Math.abs(myPoint[1]-points.get(i)[1]);
            if (min == -1 || diffs[i] <= min) {
                min = diffs[i];
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < diffs.length; i++) {
            if (diffs[i] == min) {
                int x = points.get(i)[0];
                int y = points.get(i)[1];
                answer.append(String.format("(%d, %d) ", x, y));
            }
        }
        System.out.println("[결과] 나와 가장 가까운 좌표값은 " + answer +  "입니다.");
    }

    public static int[] makePoint() {
        Scanner sc = new Scanner(System.in);
        System.out.print("x 좌표 값을 입력해주세요 : ");
        int a = sc.nextInt();
        System.out.print("y 좌표 값을 입력해주세요 : ");
        int b = sc.nextInt();
        int[] newPoint = {a, b};
        return newPoint;
    }
}