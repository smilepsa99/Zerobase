package week_07;

public class CT_02_3 {
    public static void main(String[] args) {
        String code = "5{he2{l}o}friend"; // hellohellohellohellohellofriend
//        String code = "de2{afew}w3{rq5{f}}"; // deafewafewwrqfffffrqfffffrqfffff

        // 재귀용법? : 다중으로 압축돼있는 걸 못 품 (다른건 구현하긴 했는데..)
//        String code = "a2{b}c"; // bb

        StringBuilder answer = new StringBuilder();
        String[] parts = code.split("[{}]");
        int repeat = 0;
        for (String s : parts) {
            if (isInteger(s.charAt(s.length()-1))) {
                for (int i = 0; i < s.length(); i++) {
                    if (isInteger(s.charAt(i))) {
                        repeat = s.charAt(i) - '0';
                    } else {
                        answer.append(s.charAt(i));
                    }
                }
            } else {
                if (repeat > 0) {
                    for (int i = 0; i < repeat; i++) {
                        answer.append(s);
                    }
                    repeat = 0;
                } else {
                    answer.append(s);
                }
            }
        }

        System.out.println(answer);

    }
    public static boolean isInteger(char c) {
        String s = String.valueOf(c);
        try {
            Integer.parseInt(s);
            return true; // 숫자
        } catch (NumberFormatException ex) {
            return false; // 문자, {, }
        }
    }

//    public static String unzip(String zip) {
//        String[] arr = zip.split("[{}]");
//        StringBuilder ans = new StringBuilder();
//        for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
//            ans.append(arr[1]);
//        }
//        return ans.toString();
//    }
}
