package a_datatype;




/*
 
  자료형 (데이터타입)

 
 */

public class Ex05_String {

	public static void main(String[] args) {
		
		
		char c='ㅁ';
		
		//참조형변수선언
		String name;
		//메모리확보(값지정)-> 객체생성
		name = new String("홍길동");
		
		String irum=new String("홍길동");
		
		if(name==irum) {
			System.out.println("동일이름");
		
		}else {
			System.out.println("다른 이름");
		}
		
		//문자열 비교는 equals 함수를 이용해야만 함
		if(name.equals(irum)) {
			System.out.println("동일이름2");
		
		}else {
			System.out.println("다른 이름2");
		}
	}

}
