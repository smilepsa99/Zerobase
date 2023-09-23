package week_03.pre_1;

public class _1_3 {
    public static void main(String[] args) {
        String s = "aacddefg"; // aacddefg (cefg) / aaabaaa (aba) / aaaaabcddddd (b)

        String[] arr = s.split("");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i+1])) {
                arr[i] = "";
                arr[i+1] = "";
            }
        }

        String answer = "";
        for (String str : arr) {
            if (!"".equals(str)) {
                answer += str;
            }

        }
        System.out.println(answer);
    }
}

// [참고해볼 글] https://velog.io/@rkio/Javascript-%EB%B0%B0%EC%97%B4%EB%AC%B8%EC%9E%90%EC%97%B4%EC%97%90%EC%84%9C-%EC%97%B0%EC%86%8D%EB%90%98%EB%8A%94-%EC%9B%90%EC%86%8C-%EC%A7%80%EC%9A%B0%EA%B8%B0
// 1
