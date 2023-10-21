package week_07;

import java.util.ArrayList;

public class CT_02_2 {
    public static void main(String[] args) {
        int[] a = {5, 2, 1, 4, 6};
        int[] b = {6, 1, 0, 4, 4};  // {1, 1, 3, 1, 9, 0}

//        int[] a = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
//        int[] b = {1}; // {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}

//        int[] a = {9, 9};
//        int[] b = {1, 1}; // {1, 0, 0}

        // 2
        int[] ra = reverse(a);
        int[] rb = reverse(b);

        ArrayList<Integer> list = new ArrayList<>();
        int max = 0, min = 0;
        boolean aBig = false, bBig = false;
        if (a.length > b.length) {
            aBig = true; max = a.length; min = b.length;
        } else {
            bBig = true; max = b.length; min = a.length;
        }

        int num = 0;
        boolean check = false; // 자리올림
        for (int i = 0; i < max; i++) {
            if (i > min - 1) {
                if (aBig) num = ra[i];
                else if (bBig) num = rb[i];
            } else {
                num = ra[i] + rb[i];
            }
            if (check) num++;

            System.out.println(num);

            check = plusWithTen(num, list);
            System.out.println(check);
            if (i == max-1 && check) {
                list.add(0, 1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }


        // 1
//        long an = Long.parseLong(toNumber(a));
//        long bn = Long.parseLong(toNumber(b));
//
//        String s = String.valueOf(an + bn);
//        String[] arr = s.split("");
//        int[] answer = new int[s.length()];
//
//        for (int i = 0; i < arr.length; i++) {
//            answer[i] = Integer.parseInt(arr[i]);
//        }
//
//        for (int i : answer) {
//            System.out.print(i + " ");
//        }
    }

//    public static String toNumber(int[] arr) {
//        if (arr.length == 0) return "0";
//        StringBuilder n = new StringBuilder();
//        for (int i : arr) {
//            n.append(i);
//        }
//        return n.toString();
//    }

    public static boolean plusWithTen(int num, ArrayList<Integer> list) {
        if (num < 10) {
            list.add(0, num);
            System.out.println(num + " (자리올림 없음)");
            return false;
        } else {
            String s = String.valueOf(num);
            int one = s.charAt(1) - '0';
            System.out.println(one + " (자리올림 있음)");
            list.add(0, one);
            return true;
        }
    }

    public static int[] reverse(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0;i < arr.length; i++){
            answer[i] = arr[arr.length-i-1];
        }
        return answer;
    }
}
