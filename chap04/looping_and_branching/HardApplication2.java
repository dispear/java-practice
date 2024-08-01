package chap04.looping_and_branching;

import java.util.Scanner;

public class HardApplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rand = (int) (Math.random() * 100) + 1;
        int cnt = 0;

        while (true) {
            System.out.print("정수를 입력하세요 : ");
            int n = sc.nextInt();

            cnt++;

            if (n < rand) {
                System.out.println("입력하신 정수보다 큽니다.");
            } else if (n > rand) {
                System.out.println("입력하신 정수보다 작습니다.");
            } else {
                System.out.println("정답입니다. " + cnt + "회만에 정답을 맞추셨습니다.");
                break;
            }
        }

    }
}
