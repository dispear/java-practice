package chap04.conditional;

import java.util.Scanner;

public class HardApplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String str = sc.nextLine();
        int apple = 1000;
        int banana = 3000;
        int peach = 2000;
        int kiwi = 5000;

        switch (str) {
            case "사과":
                System.out.println("사과의 가격은 " + apple + "원 입니다.");
                break;
            case "바나나":
                System.out.println("바나나의 가격은 " + banana + "원 입니다.");
                break;
            case "복숭아":
                System.out.println("복숭아의 가격은 " + peach + "원 입니다.");
                break;
            case "키위":
                System.out.println("키위의 가격은 " + kiwi + "원 입니다.");
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
                break;
        }
    }
}
