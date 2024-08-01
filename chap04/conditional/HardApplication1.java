package chap04.conditional;

import java.util.Scanner;

public class HardApplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("연산 기호를 입력하세요 : ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(num1+" + "+num2+" = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1+" - "+num2+" = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1+" * "+num2+" = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1+" / "+num2+" = " + (num1 / num2));
                break;
            case '%':
                System.out.println(num1+" % "+num2+" = " + (num1 % num2));
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                break;
        }
    }
}
