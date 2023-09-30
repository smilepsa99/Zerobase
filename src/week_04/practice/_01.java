package week_04.practice;
// [프로그래머스] 한 번만 등장한 문자

import java.util.*;
public class _01 {
    public static void main(String[] args) {
        String s = "abcabcadc";


        String[] strings = s.split("");
        HashMap<String, Integer> counts = new HashMap<>();
        for (String str : strings) {
            if (counts.containsKey(str)) {
                counts.put(str, counts.get(str) + 1);
            } else {
                counts.put(str, 1);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for (String key : counts.keySet()) {
            if (counts.get(key) == 1) {
                list.add(key);
            }
        }
        Collections.sort(list);

        String answer = "";
        for (String a : list) {
            answer += a;
        }
        System.out.println(answer);
    }
}
