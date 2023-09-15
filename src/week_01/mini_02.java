package week_01;
import java.util.Scanner;

public class mini_02 {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");

        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int cashBack = 0;

        if (cost < 3000) {
            cashBack = (cost / 1000) * 100;
        } else {
            cashBack = 300;
        }

        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.\n", cost, cashBack);
    }
}

// [참고] 자바 입력 - Scanner 사용법  https://st-lab.tistory.com/92