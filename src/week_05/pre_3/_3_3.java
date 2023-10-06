package week_05.pre_3;

public class _3_3 {
    public static void main(String[] args) {
        int n = 10; // 9


        int start = (int) Math.pow(10, n-1);
        int end = (int) Math.pow(10, n);

        long count = 0;
        for (int i = start; i < end; i++) {
            String s = String.valueOf(i);
            if (isPalin(s)) count++;
        }

        count %= 1000000007;
        System.out.println((int) count);
    }

    public static boolean isPalin(String s) {
        boolean answer = true;
        for (int i = 0; i < s.length(); i++) {
            if (i >= s.length()-1-i) return true;
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
