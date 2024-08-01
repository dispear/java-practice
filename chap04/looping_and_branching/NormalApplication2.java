package chap04.looping_and_branching;

public class NormalApplication2 {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 26; i++) {
            str += (char) ('a' + i);
        }
        System.out.println(str);
    }
}
