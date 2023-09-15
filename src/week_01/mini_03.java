package week_01;

// 백엔드스쿨 17기 박상아

import java.util.Scanner;

public class mini_03 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc1.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc2.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String national = sc3.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String card = sc4.next();
        int cost = 10000; // 기본 입장료

        if (age < 3) {
            cost = 0; // 무료
        } else if (age < 13 || time > 17) {
            cost = 4000; // 특별 할인
        } else if (national.equals("y") || card.equals("y")) {
            cost = 8000; // 일반 할인
        }
        System.out.println("입장료: " + cost);
    }
}
