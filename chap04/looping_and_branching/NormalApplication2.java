package chap04.looping_and_branching;

public class NormalApplication2 {
    public static void main(String[] args) {
        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */
        String str = "";
        for (int i = 0; i < 26; i++) {
            str += (char) ('a' + i);
        }
        System.out.println(str);
    }
}
