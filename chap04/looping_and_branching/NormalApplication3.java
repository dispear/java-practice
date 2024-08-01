package chap04.looping_and_branching;

import java.util.Scanner;

public class NormalApplication3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        String str = "";

        for (int i = 1; i <= n; i++) {
            str += i % 2 == 0 ? '박' : '수';
        }

        System.out.println(str);
    }
}
