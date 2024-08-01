package chap04.conditional;

import java.util.Scanner;

public class NormalApplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int n = sc.nextInt();

        if(n < 1 || n > 10){
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }else{
            if(n % 2 == 0)
                System.out.println("짝수다.");
            else
                System.out.println("홀수다.");
        }


    }
}
