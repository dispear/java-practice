package chap09;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == ' ') {
                sb.append(" ");
            }
        }

        String[] words = sb.toString().split(" ");
        sb = new StringBuilder();
        String maxStr = "";
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            int cnt = 1;
            if (words[i] == "") {
                continue;
            }

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) == 0) {
                    cnt++;
                    words[j] = "";
                }
            }

            if (cnt > max) {
                max = cnt;
                maxStr = words[i];
            }

            if(words[i] != ""){
                sb.append(words[i] + ": " + cnt + "\n");
            }
        }

        sb.append("가장 빈도 높은 단어 : " + maxStr + " (" + max + "번)");
        System.out.println(sb);
    }
}
