package com.greedy.level02.normal;

public class RandomMaker {
    // 최소값부터 최대값까지 범위의 난수 반환함
    public static int randomNumber(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }

    // 인자의 길이 만큼의 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환함
    public static String randomUpperAlpabet(int length){
        String s = "";
        for(int i=0; i<length; i++){
            s += (char) randomNumber(65,90);
        }
        return s;
    }

    // 가위, 바위, 보 중 한 가지를 반환함
    public static String rockPaperScissors() {
        int random = randomNumber(1, 3);
        if(random == 1){
            return "가위";
        }else if(random == 2){
            return "바위";
        }else {
            return "보";
        }
    }

    // 동전의 앞면, 뒷면 중 한 가지를 반환함
    public static String tossCoin() {
        int random = randomNumber(0, 1);
        if(random == 0){
            return "앞면";
        }else {
            return "뒷면";
        }
    }
}
