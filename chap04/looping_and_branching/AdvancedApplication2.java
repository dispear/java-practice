package chap04.looping_and_branching;

import java.util.Scanner;

public class AdvancedApplication2 {
    public static void main(String[] args) {
        /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
         *
         * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
         * 지폐외 동전을 구분하여 단위를 표기하세요
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("받으신 금액을 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("상품 가격을 입력하세요 : ");
        int num2 = sc.nextInt();

        int money = num1 - num2;
        System.out.println("============================");
        while (money > 0) {
            if (money >= 50000) {
                money = remain(50000, money);
            }else if (money >= 10000) {
                money = remain(10000, money);
            }else if(money >= 5000) {
                money = remain(5000, money);
            } else if (money >= 1000) {
                money = remain(1000, money);
            }else if(money >= 500) {
                money = remain(500, money);
            }else if(money >= 100) {
                money = remain(100, money);
            }else if(money >= 50) {
                money = remain(50, money);
            }else{
                money = remain(10, money);
            }
        }

        System.out.println("============================");
        System.out.println("거스름돈 : " + (num1 - num2) + "원");
    }

    static int remain(int x, int money) {
        int num = money / x;
        int remain = money % x;
        if (x >= 1000) {
            System.out.println(x + "원권 지폐 " + num + "장");
        } else {
            System.out.println(x + "원권 동전 " + num + "개");
        }

        return remain;
    }
}
