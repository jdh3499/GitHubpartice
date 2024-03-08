package c_control;

import java.util.Scanner;

public class Ex07_for연습 {

	public static void main(String[] args) {
		//1부터 15까지 하나만 증가시켜 출력
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요->");
		int su=sc.nextInt();
		
		for(int i=1; i<=su;i++) {
			System.out.print(i+" ");
			if(i%5==0) {
				System.out.println();
			}
			//i숫자가 5로 나머지 연산했을때 0인경우-->5의 배수인 경우 개행//개행
			
		}
	}

}
