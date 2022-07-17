package Chap02;

/**
 * 콘솔에 '안녕' 메시지를 출력하는 자바 프로그램
 */

public class Hello {
    public static void main(String[] args) {
        /**
         * 메인 메소드 내부
         */
        System.out.println("안녕!");  //화면에 문자 출력
        System.out.println("안녕" + "!"); //2개의 문자열 합쳐서 출력

        String hello = "안녕!"; //문자열을 hello 변수에 대입
        System.out.println(hello); //hello 변수의 내용 출력
    }
}
