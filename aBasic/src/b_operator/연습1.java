package b_operator;

import java.util.*;

//정수 하나 입력받아서 3의 배수인지 여부를 출력
//[예] 숫자입력 : 4
//            3의배수가아닙니다
//            3의 배수가 맞습니다.
public class 연습1 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 하나를 입력해주세요");
		a=sc.nextInt();
		
		if(a%3!=0) {
			System.out.println("3의배수가 아닙니다");
			
		}else {
			System.out.println("3의 배수입니다");
		}
		
		
	}

}
