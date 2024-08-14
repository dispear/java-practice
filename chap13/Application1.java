package chap13;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
//        학생 성적 : 100
//        추가 입력하려면 y : y
//        학생 성적 : 95
//        추가 입력하려면 y : Y
//        학생 성적 : 66
//        추가 입력하려면 y : y
//        학생 성적 : 79
//        추가 입력하려면 y : n
//        학생 인원 : 4
//        평균 점수 : 85.0

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("학생 성적 : ");
            int n = sc.nextInt();
            list.add(n);

            System.out.print("추가 입력하려면 y : ");
            if(!sc.next().equals("y")) {
                break;
            }
        }

        double avg = 0;
        for(int i = 0; i < list.size(); i++) {
            avg += list.get(i);
        }
        avg /= list.size();

        System.out.println("학생 인원 : " + list.size());
        System.out.println("평균 점수 : " + avg) ;
    }
}
