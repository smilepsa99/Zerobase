package week_01;

// 백엔드스쿨 17기 박상아

import java.time.LocalDate;
import java.util.Scanner;

public class mini_05 {
    public static void main(String[] args) {

        // 첫번째 답

        // Scanner sc1 = new Scanner(System.in);
        // Scanner sc2 = new Scanner(System.in);

        // System.out.println("[달력 출력 프로그램]");
        // System.out.print("달력의 년도를 입력해주세요.(yyyy):");
        // int year = sc1.nextInt();
        // System.out.print("달력의 월을 입력해주세요.(mm):");
        // int month = sc2.nextInt();

        // System.out.println("\n\n[" + year+ "년 " + month + "월]");
        // LocalDate date = LocalDate.of(year, month, 1);
        // int start = date.getDayOfWeek().getValue(); // 시작 요일 (1 ~ 7)
        // int monthLength = date.lengthOfMonth(); // 해당 월 길이

        // int blank = (start == 7) ? 0 : start;
        // int day = 1;
        // String[] days = new String[monthLength + blank];
        // for (int i = 0; i < days.length; i++) {
        //     if (i < blank) {
        //         days[i] = "  ";
        //     } else {
        //         days[i] = String.format("%02d", day++);
        //     }
        // }

        // System.out.println("일\t월\t화\t수\t목\t금\t토");
        // for (int i = 0; i < days.length; i++) {
        //     System.out.print(days[i] + "\t");
        //     if ((i + 1) % 7 == 0) {
        //         System.out.println();
        //     }
        // }


        // 두번째 답
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해주세요.(yyyy):");
        int year = sc1.nextInt();
        System.out.print("달력의 월을 입력해주세요.(mm):");
        int month = sc2.nextInt();

        System.out.println("\n\n[" + year+ "년 " + month + "월]");
        LocalDate date = LocalDate.of(year, month, 1);
        int start = date.getDayOfWeek().getValue(); // 시작 요일 (1 ~ 7)
        int monthLength = date.lengthOfMonth(); // 해당 월 길이

        int blank = (start == 7) ? 0 : start;
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        int day = 1;
        for (int i = 0; i < monthLength + blank; i++) {
            if (i < blank) {
                System.out.print("  \t");
            } else {
                System.out.printf("%02d\t", day++);
                if ((i + 1) % 7 == 0) {
                    System.out.println();
                }
            }
        }
    }
}

// [참고] LocalDate 사용법 https://www.daleseo.com/java8-local-date-time/
// [참고] 특정날짜의 요일 구하기 https://hianna.tistory.com/610
// [참고] 해당 월의 마지막 날짜 구하기 https://wildeveloperetrain.tistory.com/176

// [두번째 답할 때 참고] LocalDate 를 이용해 달력 만들기 https://hy-ung.tistory.com/3