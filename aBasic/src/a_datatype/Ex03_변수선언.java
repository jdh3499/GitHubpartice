package a_datatype;

public class Ex03_변수선언 {
  public static void main(String[] args) {
	
	  //[1] 변수 선언 + 값 대입
	  int kor; // 정수형 int인 변수명 kor선언
	  kor = 30; //kor방안에 30이라는 값 저장
	  //[2] 초기화 : 변수선언시 값 대입
	  
	  int kor1=30;
	  
	  int math =30, java=50;
	  
	  
	  if(kor==java) {
		  System.out.println("점수동일");
	  }else {
		  System.out.println("점수가 다름");
	  }
	  
	  // [참고]  swap : 두 변수의 값을 맞바꾸기
	  int a = 10, b=20;
	  System.out.println("A=" + a + ",B=" +b);
	  int temp = a;
	  a=b;
	  
	  b=temp;
	  System.out.println("A=" + a + ",B=" +b);

	  
	  
}
	
}
