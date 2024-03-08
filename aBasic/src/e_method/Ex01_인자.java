package e_method;

/*
 * 리턴형 메소드명(파라메타 변수){
 * 
 * 
 * }
 * 리턴형: 반환하는 값의 자료형
 *      자료형이 없으면 void를 사용 void=없다
 * 파라메타 변수:인자(argument)를 받는 변수 없으면 안써도된다
 * 
 * */
//
public class Ex01_인자 {


	public static void main(String[] args) {
		int a=10,b=20;
		
		add(a,b);//인자

	}
	static void add(int a,int b) {
		int sum=a+b;
		System.out.println("합="+sum);
	}


}
