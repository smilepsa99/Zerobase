package week_05.practice;

import java.util.Scanner;

// [백준] 1254번 팰린드롬 만들기
// (참고함) 다른사람 풀이 https://blog.naver.com/occidere/221190032874
public class _01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = "abdfhdyrbdbsdfghjkllkjhgfds"; // sc.next();

        int answer = 0;
        for (int i = 0; i <= S.length(); i++) {
            String origin = new String(S);
            String temp = S.substring(0, i);
            origin += reverse(temp);
            if (origin.equals(reverse(origin))) {
                answer = origin.length();
                break;
            }
        }
        System.out.println(answer);
    }

    public static String reverse(String s) {
        String[] parts = s.split("");
        String reverse = "";
        for (int i = parts.length - 1; i >= 0; i--) {
            reverse += parts[i];
        }
        return reverse;
    }
}
