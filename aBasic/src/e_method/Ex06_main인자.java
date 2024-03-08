package e_method;

public class Ex06_main인자 {
	//함수명(메소드명):main
	//리턴형 : void->반환하는 리턴값이 없음
	//매개변수:String[]
	//main이라는 함수에 String[]이라는 배열을 받아 
	
	
	//예시
	public static void main(String[] args) {

//		String serverIp="scot2t";
//		String password="tiger2";
		
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
	
	/*오리지널 컴파일 과정
	 * 
	 * >javac Ex06_main인자.java java파일로 컴파일해주세요
	 * >java Ex06_main인자 (안녕 하이 올라)문자열->String[] args애가 받아쓰
	 * 언제쓸까? 서버IP 서버PW
	 * 
	 * 
	 * 
	 /* */
//여기서 문자를 왜넘길까 중요한데이터들을 넘길때 실행할데이터들을 넘길때
}
