package week_02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

// 최적화해보기 https://www.acmicpc.net/source/66477494
public class _01_baek25556_2 {
    public static void main(String[] args) {
        // 1. 입력 받기 (개수, 수열)
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // 2. 네 개의 스택 만들기
        ArrayList<Stack<Integer>> stacks = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            stacks.add(new Stack<>());
            stacks.get(i).push(0);
        }

        // 3. 수열의 숫자들을 스택에 삽입하기
        boolean possible = true;
        for (int num : nums) {
            boolean bigger = false;
            for (Stack<Integer> stack : stacks) {
                if (stack.peek() < num) {
                    bigger = true;
                    stack.push(num);
                    break;
                }
            }
            if (!bigger) {
                possible = false;
                break;
            }
        }

        String answer = possible ? "YES" : "NO";
        System.out.println(answer);
    }
}
