package e_method;

import java.util.Scanner;

public class Ex09_연습 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("영문자 1개 입력->");

		String str=input.nextLine();
		char alpha=str.charAt(0);//b

		//메소드 호출
		boolean result=checkLower(alpha);
		chul(result);



	}
	static boolean checkLower(char alpha){

		if(alpha>='a'& alpha<='z') return true ;
		else return false;
	}
	static void chul(boolean result) {
		System.out.println(result);
	} 

//	static void result(char alpha) {
//		System.out.println(alpha);
//	}
	//메소드 선언
	/*(문자 1) 영문자를 입력하여 이 문자를 넘겨받아 이문자가
	 * 소문자이면 true를 반환 그렇지 않으면 false을 반환하는
	 * 메소드를 작성하시오
	 * 함수명 checkLower
	 * 인자 char
	 * 리턴(반환) boolean
	 * 
	 * 
	 * */
}
