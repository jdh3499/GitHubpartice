package b_operator;

import java.util.*;

public class 복습 {

	public static void main(String[] args) {
		/*
		 * 100점만점의 학생 점수를 입력받아 80~90 사이라면 평균이라고 출력
		 * 
		 * */
		//1)학생점수 변수 선언
		 int score;
		//2)Scanner 선언 ctrl+shift+o 누르면 자동으로 잡힘
		 Scanner sc=new Scanner(System.in);
		//3)콘솔에 "점수입력->" 문장 출력
		 System.out.println("점수 입력---->");
		//4)입력값을 1번 변수에 저장
		 score=sc.nextInt();
		//5)입력값이 80보다 크고 90보다 작다면
		if(score>80 & score<90) {
			System.out.println("점수는"+score);
		}else {
			System.out.println("평균값이 아닙니다");
		}
		 //6)'평균'출력
		/*컴파일 + 실행 이클립스에서 ctrl+F11
		 * java->class
		 * 
		 * [F11] -> debug모드
		 * 
		 * */ 
		 
		
		

	}

}
