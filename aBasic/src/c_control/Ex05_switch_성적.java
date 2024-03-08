package c_control;

import java.util.*;

public class Ex05_switch_성적 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요 ---->");
		int kor=sc.nextInt();
		System.out.println("영어 점수를 입력해주세요 ---->");
		int eng=sc.nextInt();
		System.out.println("수학 점수를 입력해주세요 ---->");
		int math=sc.nextInt();
		
		int total=kor+eng+math;
		
		int avg=total/3;
		
		System.out.println("평균="+avg);
		//switch 문써서 "학점 : " switch에는 문자형 정수 문자열만 들어올수있음 case에는 값만쓸수있따 비교연산자가 들어올수없다.
		
		char score='0';
		
		switch(avg/10) {
		case 10: 
		case 9: score='A';
		break;
		case 8: score='B';
		break;
		case 7: score='C';
		break;
		default : score='F';
		break;
		
		}
		System.out.println("학점"+score);
	}

}
