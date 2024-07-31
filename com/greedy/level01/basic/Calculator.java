package com.greedy.level01.basic;

public class Calculator {

    // 함수 호출 확인용 메소드
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    // 1부터 10까지 수를 더하여 값을 리턴함
    public int sum1to10(){
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += i;
        }
        return sum;
    }

    // 두 수를 입력받아 큰 수를 출력함
    public void checkMaxNumber(int a, int b) {
        System.out.println("두 수 중 큰 수는 " + Math.max(a,b) + "이다.");
    }

    // 두 수를 입력받아 합을 리턴함
    public int sumTwoNumber(int a, int b) {
        return a+b;
    }

    // 두 수를 입력받아 차를 리턴함
    public int minusTwoNumber(int a, int b){
        return a-b;
    }
}
