package c_control;

import java.util.Calendar;

public class 연습_나이구하기 {

	public static void main(String[] args) {
		String id="241212-3234567";
		
		/*참고 9:숫자
		 *  '9':문자
		 *  "9":문자열 
		 */
		String age_str=id.substring(0, 2);
		System.out.println(age_str);//"90"
		
		//String-> int형으로 변환
		//"90"->90
		
		//문자열을 숫자로 바꿀때는 Integer(parseInt)을 쓴다.
		int nai=Integer.parseInt(age_str);
		System.out.println(nai);
		//올해ㄴㄴ도 구하기		
		Calendar c= Calendar.getInstance();
		int year  = c.get(Calendar.YEAR);
		
		
		
		int age=0;
		
		char ch=id.charAt(7);
		String gender="";
		
		if(ch=='1'|ch=='2') {
			age = year-(1900+nai)+1;
		}else if(ch=='3'|ch=='4') {
			age = year-(2000+nai)+1;
		}
		
		
		
		System.out.println("나이 : "+age);

	}

}
