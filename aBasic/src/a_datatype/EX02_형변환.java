package a_datatype;

public class EX02_형변환 {

	public static void main(String[] args) {
		
		//*******기본형
		// 변수의 자료형과 값이 일치

		int su;
		su ='문';
		System.out.println((char)su);
		
		double d;
		d=1000;
		System.out.println(d);
		
//		int su2;
//		su2=1.2;
		
		//float f;
		//f=1.2f; //4byte변수에 8byte 값을 넣고자 하는 상황 그래서안들어감 
		
		long big;
		big =10000000000L;//소문자L을 붙이면 1과 유사하므로 대문자를 붙여준다
		System.out.println(big);
		
	}

}
//코드 줄맞춤
//Ctrl+a >> Ctrl+i