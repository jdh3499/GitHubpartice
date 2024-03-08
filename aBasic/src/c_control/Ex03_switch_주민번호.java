package c_control;

public class Ex03_switch_주민번호 {

	public static void main(String[] args) {
		String id="990930-0946234";
		
		/*
		 * 
		 * switch 문장으로 주민번호7번째 문자에 의해 성별 결정*/
		char ch=id.charAt(7);
		System.out.println(ch);
		
		String gender="";
		
		switch(ch){
		case '9': 
		case '1': 
		case '3': gender="남자"; break;
		case '0': 
		case '2': 
		case '4': gender="여자"; break;
			
		}
		System.out.println(gender+"입니다");
		
		
		
		
//		char ch=id.charAt(8);
//		System.out.println(ch);
//		
//		String chul="";
		/* 출신지값이 
		 * 0이면 서울
		 * 1이면 인천/부산
		 * 2라면 경기출신*/
		
//		switch(ch) {
//		case '0' : System.out.println("서울출신");
//					break;
//		case '1' : System.out.println("인천/부산출신");
//					break;
//		case '2' : System.out.println("경기출신");
//					break;
//		default : System.out.println("한국인");
//		}
//		switch(ch) {
//		case '0' : chul ="서울";
//					break;
//		case '1' : chul ="인천/부산";
//					break;
//		case '2' : chul ="경기";
//					break;
//		default :  chul ="한국인";
//		}
//		System.out.println(chul+"출신입니다");
//		
		

	}

}
