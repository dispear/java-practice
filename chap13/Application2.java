package chap13;

import java.util.Scanner;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
//        최근 방문 url : [https://www.google.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
//        최근 방문 url : [https://github.com/, https://www.google.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.notion.so/
//        최근 방문 url : [https://www.notion.so/, https://github.com/, https://www.google.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.naver.com/
//        최근 방문 url : [https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
//        최근 방문 url : [https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
//        최근 방문 url : [https://www.google.com/, https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : exit

        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<>();

        while(true){
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String url = sc.nextLine();
            if(url.equals("exit")) break;

            st.push(url);

            System.out.print("최근 방문 url : [");
            int a = 0;
            for(int i=st.size()-1;i>=0;i--){
                String s = st.get(i);
                System.out.print(s);
                a++;

                if(i == 0 || a == 5){
                    System.out.println("]");
                    break;
                }else{
                    System.out.print(", ");
                }
            }
        }
    }
}
