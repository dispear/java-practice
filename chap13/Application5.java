package chap13;

import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
//        단어 입력 ('exit' 입력 시 종료): 안녕
//        단어 입력 ('exit' 입력 시 종료): java
//        단어 입력 ('exit' 입력 시 종료): collection
//        단어 입력 ('exit' 입력 시 종료): 프로그래밍
//        단어 입력 ('exit' 입력 시 종료): exit
//        정렬 된 단어 : [collection, java, 안녕, 프로그래밍]

        Scanner sc = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();

        while (true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String word = sc.nextLine();

            if(word.equals("exit")) {
                break;
            }

            set.add(word);
        }

        System.out.println("정렬 된 단어 : " + set);
    }
}
