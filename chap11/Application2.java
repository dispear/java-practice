package chap11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         *
         * 파일 복사가 성공적으로 완료 되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         *
         */
        Scanner sc = new Scanner(System.in);
        FileReader fr = null;
        FileWriter fw = null;
        String str = null;
        try {
            System.out.print("원본 파일의 이름을 입력하세요 : ");
            str = sc.nextLine();
            fr = new FileReader(str);

            char[] carr = new char[1000];
            fr.read(carr);

            System.out.print("복사 파일의 이름을 입력하세요 : ");
            fw = new FileWriter(sc.nextLine());

            int i = 0;
            while (carr[i] != '\0') {
                fw.write(carr[i++]);
            }

            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");

        } catch (FileNotFoundException e) {
            System.out.println("오류 : " + str + " (지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
