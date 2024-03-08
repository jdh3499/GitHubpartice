package c_control;

import java.util.Scanner;

public class Ex11_dowhile연습 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//[2]반복횟수가 정해지지 않을 때 while문을 사용한다
//		while(true) {
//			System.out.println("구구단의 단수->");
//			
//			int dan = input.nextInt();
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan +"*" + i + "=" + dan*i );
//			}
//			System.out.println("종료를 원하십니까?(Y/N)");
//			String answer=input.next();
//			if(answer.equals("Y")|answer.equals("y"))break;
//			else if(answer.equals("N")|answer.equals("n"))continue;
//			
//			
//		}
//		
//		// [1] for 문이용 : 반복횟수가 정해진 경우
//		System.out.println("구구단 몇 번 반복할까요?");
//		int  num = input.nextInt();
//		
//		for( int j=0; j<num; j++) {			
//			System.out.println("구구단의 단수->");
//			
//			int dan = input.nextInt();
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan +"*" + i + "=" + dan*i );
//			}	
//		}
		//[3]do~while문이용: 반복횟수가 정해지지 않을 떄
		String answer="";
		do {
			System.out.println("구구단의 단수->");
			
			int dan = input.nextInt();
			for(int i=1; i<=9; i++) {
				System.out.println(dan +"*" + i + "=" + dan*i );
			}
			System.out.println("계속하시겠습니까?(Y/N)");
			answer=input.next();
			
		}while(answer.equals("Y")|answer.equals("y")); 
		
			
		
		
	}



}


