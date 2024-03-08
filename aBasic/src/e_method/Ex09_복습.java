package e_method;

import java.util.Scanner;

public class Ex09_복습 {

	public static void main(String[] args) {

		// 합격 여부 출력
		String score=func();
//		System.out.println("당신은 "+score+"입니다");
		method(score);

	}
	
	static void method(String score) {
		System.out.println("당신은"+score+"입니다");
	}
	//역할 : 콘솔창에서 점수를 입력받기'
	//해당 점수가 80점 이상이면 합격 그렇지 않으면 불합격문장을 반환
	static String func() {
		Scanner sc=new Scanner(System.in);
		System.out.println("당신의 점수->");
		int score=sc.nextInt();
		
		if(score>=80) {
			return "합격";
		}else {
			return "불합격";
		}
		
	}
	

}
