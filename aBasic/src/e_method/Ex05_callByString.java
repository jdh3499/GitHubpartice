package e_method;


// *String 특별 경우
// -내용이 변경되면 메모리를 새로 생성 기존에 원래있던메모리는 쓰레기가됨
// -갈비지컬렉터 쓰레기수집가 출동해서 쓰레기 없앰->jvm
public class Ex05_callByString {

	public static void main(String[] args) {

//		String a=new String("안녕");
//		String b=new String("하이");
		String a="안녕";
		String b="하이";

		add(a,b);
		System.out.println("A="+a+"B="+b);

	}
	static void add(String a,String b) {
		a+=b;
		System.out.println("A="+a+"B="+b);
	}

}


