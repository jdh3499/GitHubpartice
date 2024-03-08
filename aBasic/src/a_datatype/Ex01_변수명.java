package a_datatype;

//주석
/*
 여러줄
 주석
*/

/**
   여러줄 주석
   설명문 주석

  */

/*
 변수명 규칙
  -문자+숫자+_+ ($)
  -첫글자로 숫자는안됨
  -길이제한없음
  -대소문자 구별함
  -키워드 안됨
  
  명명 권자사항
  - 패키지명(폴더) 전부 소문자
  - 클래스명 첫글자만 대문자+영단어의 첫글자 대문자
	ex) CuteDogBath->낙타표기법(camel case)
  - 함수명/변수명 첫글자는 소문자 + 영단어의 첫글자 대문자
  	ex) catBathAndFeed
*/
 
public class Ex01_변수명 {

	public static void main(String[] args) {
		//변수선언
		
		//*****기본형
		//(1) 변수의 자료형과 값이 일치
		//(2) 크기가 큰 자료형에 작은 값 넣을때(자동형변환)
		//(3) 크기가 작은 자료형에 큰 값을 넣을 때
		//     -> 에러발생
		//	   -> 형변환필요(casting)
		char chName;
		int i;
		int int1;
		double abcdef;
		boolean a;
		boolean b;
		
		// 값 저장
		chName ='김'; //문자형 ''
		i=100;
		abcdef =3.6;
		a=true; //false
		//출력 단축키 syso Ctrl+Space
		System.out.println(chName);
		System.out.println(i);
		System.out.println(abcdef);
		System.out.println(a);
		
		int z=6;
		z=(int)1.6;
		System.out.println(z);
	}

}


/*
   변수 
   - 메모리상에 값을 저장하는 공간
   
   자료형(데이터 타입)
   	1.기본형(Primitive)
   		- 논리형 boolean 1byte
   		- 문자형 char    2byte
   		- 정수형 int/long(byte/short->2byte) 4byte/8byte
   		- 실수형 double    (float:4byte)  8byte
   	
   	
   	2.참조형(Reference)
  		- 배열/클래스
  	[참고]
  	1bit : 0 or 1
  	8bit : 1byte
  	
  	1024B   = 1KB
  	1024KB  = 1MB
  	1024MB  = 1GB
  	1024GB  = 1TB
  	[참고]
  	int : 4B = 32bit
  	0bit : 부호(0:+ 1:-)
  	나머지 31bit : 숫자 표현
  	-2(31)~ +2(31)-1
    대략 22억
    은행에서 쓸려면 long타입을 써야 22억이상 금액이 가능하다 
    */
