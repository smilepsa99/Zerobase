package week_01;

// 백엔드스쿨 17기 박상아

import java.util.Scanner;
import java.util.ArrayList;

public class mini_08 {
//    public static int income = 0;
//    public static ArrayList<int[]> list;
//    public static void incomeData(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("[과세금액 계산 프로그램]");
//        System.out.print("연소득을 입력해 주세요.:");
//        try{
//            income = sc.nextInt();
//            sc.close();
//        } catch (Exception e){
//            System.out.println("정확한 숫자만 입력해주세요.");
//            sc.close();
//        }
//    }
//    public static void incomeTaxRateCal(){
//        list = new ArrayList<>();
//        int[] taxBase = {0, 12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000,1000000000};
//        int[] taxRate = {0, 6, 15, 24, 35, 38, 40, 42, 45};
//        int[] progressiveTax = {0, 0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};
//
//        for (int i = 1; i < taxBase.length; i++) {
//            if (i == 1) {
//                if (income <= taxBase[i]) {
//                    int[] result = new int[4];
//                    int tax = income / 100 * taxRate[i];
//                    result[0] = income;
//                    result[1] = taxRate[i];
//                    result[2] = tax;
//                    result[3] = progressiveTax[i];
//                    list.add(result);
//                }
//            } else if (i == 8) {
//                if (income > taxBase[i]) {
//                    taxCal(i, taxBase, taxRate, progressiveTax);
//                }
//            } else {
//                if ((income > taxBase[i - 1] && income <= taxBase[i])) {
//                    taxCal(i, taxBase, taxRate, progressiveTax);
//                }
//            }
//        }
//    }
//
//    public static void output(){
//        int taxTotal = 0;
//        int[] progressiveDeduction = new int[2];
//        for (int i = 0; i < list.size(); i++) {
//            int[] num = list.get(i);
//            if(i==list.size()-1){
//                progressiveDeduction[0] = num[1];
//                progressiveDeduction[1] = num[3];
//            }
//            taxTotal += num[2];
//            System.out.printf("%10d * %2d",num[0],num[1]);
//            System.out.print("% =\t");
//            System.out.printf("%10d\n",num[2]);
//        }
//        System.out.println();
//        System.out.printf("[세율에 의한 세금]:\t\t%10d\n",taxTotal);
//        System.out.printf("[누진공제 계산에 의한 세금]:\t%10d",((income / 100) * progressiveDeduction[0]) -progressiveDeduction[1]);
//    }
//
//    public static void taxCal(int i, int[] taxBase,int[] taxRate,int[] progressiveTax) {
//        int[] result;
//        int tax;
//        for (int j = 1; j < i; j++) {
//            result = new int[4];
//            tax = (taxBase[j] - taxBase[j - 1]) / 100 * taxRate[j];
//            result[0] = taxBase[j] - taxBase[j - 1];
//            result[1] = taxRate[j];
//            result[2] = tax;
//            result[3] = progressiveTax[j];
//            list.add(result);
//        }
//        result = new int[4];
//        tax = (income - taxBase[i - 1]) / 100 * taxRate[i];
//        result[0] = income - taxBase[i - 1];
//        result[1] = taxRate[i];
//        result[2] = tax;
//        result[3] = progressiveTax[i];
//        list.add(result);
//    }
//
//    public static void main(String[] args) {
//        incomeData();
//        incomeTaxRateCal();
//        output();
//    }
}