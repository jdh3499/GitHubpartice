package b_operator;

import java.util.Scanner;

public class 연습2_1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("문자입력");
		
		String str=input.next();
		char ch=str.charAt(0);
		System.out.println("입력확인:"+ch);
		//A=65,B=66
		if('A'<=ch&&ch<='Z') {
			System.out.println("대문자입니다");
		}else if('a'<=ch&&ch<='z') {
			System.out.println("소문자입니다");
		}else {
			System.out.println("기타입니다");
		}
			

	}

}
