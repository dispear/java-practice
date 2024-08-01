package chap04.conditional;

import java.util.Scanner;

public class AdvancedApplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;

        if(avg < 60){
            System.out.println("평균 점수 미달로 불합격입니다.");
        }
        if(a < 40){
            System.out.println("국어 점수 미달로 불합격입니다.");
        }
        if(b < 40){
            System.out.println("영어 점수 미달로 불합격입니다.");
        }
        if(c < 40){
            System.out.println("수학 점수 미달로 불합격입니다.");
        }
        if(avg >= 60 && a >= 40 && b >= 40 && c >= 40){
            System.out.println("합격입니다!");
        }
    }
}
