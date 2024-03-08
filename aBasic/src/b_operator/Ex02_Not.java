package b_operator;

public class Ex02_Not {
	
	/*
	 결과를 반대로 하는 연산자
	 -일반논리:!
	 -이진논리:~
	 
	 */

	public static void main(String[] args) {
		//일반논리
		boolean result=3<4;
		System.out.println(result);
		System.out.println(!result);
		
		//이진논리
		int a=15;
		System.out.println(a);
		
		System.out.println(~a);// 11111111 11111111 11111111 11110000//00000000 00000000 000000000 00000000
	}

}
