package b_operator;


/*
 * 문자열 처리 클래스*
  -String
  -StringBuffer 
  -StringBuilder
  
  *
  */
public class Ex11_문자열클래스 {

	public static void main(String[] args) {
		//string 특권리스트
		//String만 new안써도되고 나머진 다써야한다.
		//String 특권 +연산가능
		// 언제String 쓰고 언제 StringBuffer쓰는지
		
//		String s=new String("홍길됭");
//		System.out.println("String : "+s);
//		
//		String s2="홍길동2";
//		System.out.println("String : "+s2);
//		
//		StringBuilder sb1=new StringBuilder("도복순");
//		System.out.println(sb1);
//		
//		StringBuffer sb2=new StringBuffer("홍길순2");
//		System.out.println("SB: "+sb2);
		
		String s3="홍길동3";
		s3+="화이팅";
		//이건 메모리 새로생성해서 주소번지가 바뀐곳에 새로생성후 주소 재부여
		//그럼기존의 남아있는 메모리는 쓰레기메모리 갈비지 없앨수없음
		//자바는 갈비지 컬렉터가 있어 메모리를 자동으로 수집해준다 즉 쓰레기수집가가 따로있다.
		//문자열의 변화가심하면 스트링버퍼나 스트링빌더를 써야한다. 
		//왜냐 스트링을 쓰면 메모리를 새로부여하기때문에 기존에 남아있는 메모리는 쓰레기메모리 즉 갈비지메모리가 되기때문이다
		System.out.println("String : "+s3);
		//----------------------
		StringBuffer sb=new StringBuffer("홍길순");
		//한번 저장된 주소의 값에 값을계속변경
		sb.append("화이팅");
		System.out.println("SB: "+sb);
		//->주소방안에들어가서 붙여줌
		
		//메모리 속도차이
		

	}

}
