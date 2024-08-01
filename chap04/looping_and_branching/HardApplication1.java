package chap04.looping_and_branching;

import java.util.Scanner;

public class HardApplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
            int n = sc.nextInt();
            if (n <= 2)
                continue;

            boolean flag = true;
            for(int i = 2; i < n; i++) {
                if(n % i == 0){
                    flag = false;
                    break;
                }
            }

            if (flag){
                System.out.println("소수다.");
                break;
            }else {
                System.out.println("소수가 아니다.");
                break;
            }
        }
    }
}
