package chap04.conditional;

import java.util.Scanner;

public class AdvancedApplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int salary = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int sales = sc.nextInt();

        int bouns = 0;
        if(sales >= 50000000 ){
            bouns = 5;
        }else if(sales >= 30000000){
            bouns = 3;
        }else if(sales >= 10000000){
            bouns = 1;
        }else{
            bouns = 0;
        }

        int bouseSalary = sales * bouns / 100;
        int totalSalary = salary + bouseSalary;

        System.out.println("======================");
        System.out.println("매출액 : " + sales);
        System.out.println("보너스율 : " + bouns + "%");
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + bouseSalary);
        System.out.println("======================");
        System.out.println("총 급여 : " + totalSalary);
    }
}
