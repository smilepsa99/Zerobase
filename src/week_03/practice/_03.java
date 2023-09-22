package week_03.practice;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

// [백준] 9012번 괄호
public class _03 {
    public static void main(String[] args) {
        // [참고] https://st-lab.tistory.com/178

        // 1. 입력받기
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] ps = new String[len];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = sc.next();
        }

        // 2. VPS 인지 판단하기 (YES/NO)
        String[] answer = new String[len];
        for (int i = 0; i < ps.length ; i++) {
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < ps[i].length(); j++) {
                if (ps[i].charAt(j) == '(') {
                    stack.push("(");
                } else if (ps[i].charAt(j) == ')') {
                    try {
                        stack.pop();
                    } catch (EmptyStackException e) {
                        answer[i] = "NO";
                        break;
                    }
                }
            }
            if (answer[i] != null) continue;
            answer[i] = (stack.size() == 0) ? "YES" : "NO";
        }

        // 3. 답 출력하기
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
