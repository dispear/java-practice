package chap04.conditional;

import java.util.Scanner;

public class BasicApplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int n = sc.nextInt();

        if(n>0)
            System.out.println("양수다.");
        else
            System.out.println("양수가 아니다.");

    }
}
