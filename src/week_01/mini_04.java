package week_01;

// 백엔드스쿨 17기 박상아

import java.util.Scanner;
import java.util.Random;

public class mini_04 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);

        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yy):");
        String year = sc1.next();
        System.out.print("출생월을 입력해 주세요.(mm):");
        String month = sc2.next();
        System.out.print("출생일을 입력해 주세요.(dd):");
        String day = sc3.next();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc4.next().equals("m") ? "3" : "4";

        Random random = new Random();
        int nums = random.nextInt(999999) + 1;

        String idNumbers = year + month + day + "-" + gender + String.format("%06d", nums);
        System.out.println(idNumbers);
    }
}

// [참고] 자바 Random https://coding-factory.tistory.com/530