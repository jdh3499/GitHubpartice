package b_operator;

import java.util.Scanner;

public class 연습2 {
    public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);

      System.out.print("문자 입력하세요: ");
      char ch = sc.next().charAt(1);
//      char ch = sc.next().charAt(1);
      //String->char 형변환이 안됨
      //형변환은 기본형끼리 메모리구조가 다르기때문에
      if (ch >= 'a' && ch <= 'z') {
          System.out.println("소문자입니다.");
      } else if (ch >= 'A' && ch <= 'Z') {
          System.out.println("대문자입니다.");
      } else {
          System.out.println("문자입니다.");
      }
    }
}
