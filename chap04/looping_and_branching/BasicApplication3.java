package chap04.looping_and_branching;

import java.util.Scanner;

public class BasicApplication3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("1부터 " + n +"까지의 짝수의 합 : " + sum);

    }
}
