package week_03.practice;
// [프로그래머스] 숫자 문자열과 영단어

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strings.length; i++) {
            if (s.contains(strings[i])) {
                s = s.replace(strings[i], String.valueOf(i));
            }
        }
        int answer = Integer.parseInt(s);
        System.out.println(answer);
    }
}
