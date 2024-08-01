package chap01;

public class NormalApplication2 {
    public static void main(String[] args) {
        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;
        int sum = (int) (korean + math + english);
        int avg = sum / 3;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
