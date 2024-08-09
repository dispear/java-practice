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
        Scanner sc = new Scanner(System.in);
        System.out.print("병합할 파일의 개수 입력 : ");
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int  i = 1; i <= n; i++){
            System.out.print( i + " 번째 파일 이름 입력 : ");
            str[i-1] = sc.next();
        }
        System.out.print("병합 될 파일명 입력 : ");
        String s = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(Arrays.toString(str)));
            BufferedWriter bw = new BufferedWriter(new FileWriter(s))){

            String temp = null;
            while((temp = br.readLine()) != null){
                bw.write(br.readLine());
            }

            System.out.println("파일 병합이 완료 되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("오류 : "+ str +" (지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
