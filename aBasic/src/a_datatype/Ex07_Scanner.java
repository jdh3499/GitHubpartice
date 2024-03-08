package a_datatype;

import java.util.Scanner;

/*
 * 콘솔에 출력
  System.out
  		'print()'
  		'println()
  		'pfintf()
  
  콘솔에 입력
  	System.in
  -> Scanner 이용
  
   Scanner 이용
   문자열 입력시: next()/nextLine()==========>[과제]
   정수형 입력시: nextInt()
   실수형 입력시: nextDouble()
  
  
  
  
 */



public class Ex07_Scanner {

	public static void main(String[] args) {
		System.out.println("이름을 입력하세요----->");
		Scanner input=new Scanner(System.in);
		//패키지임포트 자동 단축키 : Ctrl+Shift+o(영문자)
	
		String name=input.nextLine();
		System.out.println("당신의 이름은 "+name+" 입니다");
		
		System.out.println("두번째 이름을 입력하세요----->");
		String name1=input.next();
		System.out.println("당신의 이름은 "+name1+" 입니다");
//		
//		두 정수를 입력받아 변수 first,second 저장하기
//		두정수를 더해서 add변수에 저장하기
//      add 변수값을 화면에 출력하기
		
//		System.out.println("숫자를 입력하세요----->");
//		Scanner input=new Scanner(System.in);
//		
//		int first,second;
//		first=input.nextInt();
//		second=input.nextInt();
//		
//		int add=first+second;
//		
//		System.out.println(add);
		
		
		
	}

}
