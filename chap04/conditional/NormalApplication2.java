package chap04.conditional;

import java.util.Scanner;

public class NormalApplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("체증을 입력하세요(kg) : ");
        int w = sc.nextInt();
        System.out.print("키를 입력하세요(m) : ");
        double h = sc.nextDouble();

        double bmi = w / (h * h);

        if(bmi < 20){
            System.out.println("당신은 저체중 입니다.");
        }else if (bmi < 25){
            System.out.println("당신은 정상체중 입니다.");
        }else if (bmi < 30){
            System.out.println("당신은 과체중 입니다.");
        }else{
            System.out.println("당신은 비만 입니다.");
        }
    }
}
