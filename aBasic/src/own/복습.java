package own;

public class 복습 {

	public static void main(String[] args) {
		//주민번호를 저장할 변수 SN을 만들기
		String sn;
		sn="890930-123456";
		char g=sn.charAt(0);
		
		//if문써서 0이나 9라면 MZ세대입니다 
		//switch문장이용
		//g문자가 0또는 9라면 청년
		//g문자가 8이라면 젊은이
		//그외는 정상인
		
//		if(g=='0'|g=='9') {
//			System.out.println("MZ세대입니다.");
//		}
		
		switch(g) {
		case '0' : System.out.println("청년");
		case '9' : System.out.println("청년");
		break;
		case '8' : System.out.println("젊은이");
		break;
		default : System.out.println("정상인");
		}

	}

}
