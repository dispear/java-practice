package chap01;

public class BasicApplication2 {
    public static void main(String[] args) {
        double width = 12.5;
        double height = 36.4;

        double area = width * height;
        double circumference = 2 * width + 2 * height;

        System.out.println("면적 : " + area);
        System.out.println("둘레 : " + circumference);
    }
}
