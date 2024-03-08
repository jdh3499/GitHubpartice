package c_control;

public class Ex02_1학번 {

	public static void main(String[] args) {
		String Danga="";
		String hakga="";

		String hakbun="2019211001";
		String year=hakbun.substring(0,4);
		//ch는 입학년도 ch1는 단과대 번호 ch2는 학과번호

		String ch=hakbun.substring(4,5);

		String ch2=hakbun.substring(5,7);

		if(ch.equals("1")){
			Danga="공대";
			if(ch2.equals("11")) {
				hakga="컴퓨터학과";
			}else if(ch2.equals("12")){
				hakga="소프트웨어학과";
			}else if(ch2.equals("13")) {
				hakga="모바일학과";
			}else if(ch2.equals("22")) {
				hakga="모바일학과";
			}else{
				hakga="서버학과";
			}

		}else {
			Danga="사회대";
			if(ch2.equals("11")) {
				hakga="사회학과";
			}else if(ch2.equals("12")) {
				hakga="경영학과";
			}else{
				hakga="경제학과";
			}
		}

		System.out.println(hakbun+"는 "+year+"년도에 입학한 "+Danga+" "+hakga+"과 학생입니다" );

	}

}
