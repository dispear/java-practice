package chap04.looping_and_branching;

public class BasicApplication1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1부터 10까지의 합 : " + sum);
    }
}
