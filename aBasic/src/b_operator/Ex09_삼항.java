package b_operator;

import java.util.Scanner;
/*삼항연산자
 * 조건? 참인경우실행문:거짓인경우실행문*/
public class Ex09_삼항 {

	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		System.out.println("당신의 점수를 입력하세요->");
//		
//		int score=in.nextInt();
//		
//		String result=(score >80) ? "합격":"불합격";
//		System.out.println(" 결과:" + result);
		/*
		 * 두수를 입력받아 a,b변수를 저장
		 * 그 두 수 중에서 큰수를 출력
		 * int max = (a>b)?a : b*/
		Scanner in=new Scanner(System.in);
		int a,b;
		System.out.println("첫번째숫자를 입력하세요---->");
		a=in.nextInt();
		System.out.println("두번째숫자를 입력하세요---->");
		b=in.nextInt();
		
		
		int max=(a>b)? a: b;
		System.out.println("더 큰것은"+max);
	}

}
