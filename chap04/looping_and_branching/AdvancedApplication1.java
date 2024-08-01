package chap04.looping_and_branching;

import java.util.Scanner;

public class AdvancedApplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt() % 26;

        String newStr = "";
        for(int i = 0 ; i < str.length() ; i++){
            char c = (char) (str.charAt(i) + num);
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                if(c > 'z')
                    c -= 26;
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                if (c > 'Z')
                    c -= 26;
            }else{
                c -= num;
            }

            newStr += c;
        }

        System.out.println(newStr);
    }
}
