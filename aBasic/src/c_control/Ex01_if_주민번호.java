package c_control;

import java.util.*;
/*
 * 자료형 
  	-기본형 : boolean/char/int/double
  	-참조형 : 클래스/배열
  	(*)String
 */


public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		//프로그램 언어는 0부터세고 데이터베이스는 1부터센다
		//String id = "";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("주민번호를 입력해주세요--->");
		
		
		String id=sc.next();
		char dong=id.charAt(7);
		
		
		//IT계열 학번 주민번호 전화번호는 문자처리 계산하면 큰일나기 때문
		//char dong=id.charAt(7);
		
		if((dong=='1'|| dong =='3')||dong=='9') {
			System.out.println("당신은 남자입니다");
		}else if(dong=='0'|| dong =='2'||dong=='4') {
			System.out.println("당신은 여자입니다");
		}
		

	}

}
