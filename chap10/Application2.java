package chap10;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         *
         * 만 20세 미만은 입장 불가입니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         *
         * 입장하셔도 됩니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         *
         * 날짜 양식을 잘못 입력하셨습니다.
         */
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            LocalDate localDate = LocalDate.parse(sc.nextLine());

            checkException(localDate);

            System.out.println("입장하셔도 됩니다.");
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }catch (DateTimeParseException e){
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        }

    }

    public static void checkException(LocalDate dateBirth) throws InvalidAgeException {
        LocalDate dateNow = LocalDate.now();
        LocalDate checkDay = dateNow.minusYears(20);
        if (dateBirth.isAfter(checkDay)) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
        }
    }
}
