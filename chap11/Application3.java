package chap11;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args){
//        병합할 파일의 개수 입력 : 3
//        1 번째 파일 이름 입력 : test.txt
//        2 번째 파일 이름 입력 : test2.txt
//        3 번째 파일 이름 입력 : test3.txt
//        병합 될 파일명 입력 : result.txt
//        파일 병합이 완료 되었습니다.
        Scanner scanner = new Scanner(System.in);

        System.out.print("병합할 파일의 개수 입력 : ");
        int numberOfFiles = scanner.nextInt();
        scanner.nextLine();

        String[] fileNames = new String[numberOfFiles];
        for (int i = 0; i < numberOfFiles; i++) {
            System.out.print((i + 1) + " 번째 파일 이름 입력 : ");
            fileNames[i] = scanner.nextLine();
        }

        System.out.print("병합 될 파일명 입력 : ");
        String destinationFile = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            for (String fileName : fileNames) {
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
            System.out.println("파일 병합이 완료 되었습니다.");
        } catch (IOException e) {
            System.out.println("오류 : "+ str +" (지정된 파일을 찾을 수 없습니다)");
        }
    }
}
