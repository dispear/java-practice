package chap13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
//        대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 유관순
//        유관순 고객님 대기 등록 되었습니다.
//                대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 홍길동
//        홍길동 고객님 대기 등록 되었습니다.
//                대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//        유관순 고객님 차례입니다.
//                대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 신사임당
//        신사임당 고객님 대기 등록 되었습니다.
//                대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//        홍길동 고객님 차례입니다.
//                대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//        신사임당 고객님 차례입니다.
//                대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//        대기 고객이 없습니다.
//                대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): exit

        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<String>();

        while(true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String name = sc.nextLine();

            if(name.equals("exit")) {
                break;
            }else if(name.equals("next")) {
                if(!q.isEmpty()) {
                    String temp = q.poll();
                    System.out.println(temp + " 고객님 차례입니다. ");
                }else{
                    System.out.println("대기 고객이 없습니다.");
                }
            }else{
                q.offer(name);
                System.out.println(name + " 고객님 대기 등록 되었습니다.");
            }
        }
    }
}
