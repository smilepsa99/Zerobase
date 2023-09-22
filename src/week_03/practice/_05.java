package week_03.practice;
// [백준] 10807번 개수세기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class _05 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] nums = new int[size];
//        for (int i = 0; i < size; i++) {
//            nums[i] = sc.nextInt();
//        }
//        int target = sc.nextInt();
//
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            if (nums[i] == target) count++;
//        }
//        System.out.println(count);


        // [2 해쉬테이블 사용] 성공
        // [참고] https://velog.io/@kaifa/%EA%B0%9C%EC%88%98-%EC%84%B8%EA%B8%B0
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] nums = new int[len];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());

        Hashtable<Integer, Integer> counts = new Hashtable<>();
        for (int n : nums) {
            if (counts.containsKey(n)) {
                counts.put(n, counts.get(n) + 1);
            } else {
                counts.put(n, 1);
            }
        }

        // int answer = (counts.get(target) == null) ? 0 : counts.get(target);
        // System.out.println(answer);

        // getOrDefault https://developer-rabbit.tistory.com/entry/%EB%B0%B1%EC%A4%80-10807%EB%B2%88JavaHashMap-%EA%B0%9C%EC%88%98-%EC%84%B8%EA%B8%B0
        System.out.println(counts.getOrDefault(target, 0));
    }
}
