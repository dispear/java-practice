package chap04.looping_and_branching;

import java.util.Scanner;

public class HardApplication3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 'z' || str.charAt(i) < 'a') {
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
        }else{
            System.out.print("문자 입력 : ");
            char ch = sc.next().charAt(0);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch)
                    count++;
            }

            System.out.println("포함된 갯수 : " + count + "개");
        }
    }
}
