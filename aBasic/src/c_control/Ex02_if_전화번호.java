package c_control;

import java.util.Scanner;
public class Ex02_if_전화번호 {

	public static void main(String[] args) {
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("전화번호를 입력해주세요---->");
		//		String tel=sc.next();
		//		
		//String tel="02-123-4567";
		//		 
		//int idx=tel.indexOf("-");
		//		 //System.out.println(idx);
		//		 
		//String localNum=tel.substring(0,idx);//0부터2앞에 꺼까지
		//		 System.out.println(localNum);
		//		 //숫자를 비교할땐 == 문자열을 비교할땐 [equals]
		//		 if(localNum.equals("02")) {
		//			 System.out.println("서울입니다");
		//		 }else if(localNum.equals("032")){
		//			 System.out.println("인천입니다");
		//		 }else {
		//			 System.out.println("한국입니다");
		//		 }

		/*지역번호가 02라면 "서울입니다
		 * 그렇지 않고 지역번호가 032라면 인천입니다출력
		 * 나머지는 한국입니다 출력
		 * */
		//		 String city="";//빈 문자열로 초기화시킨다.
		//		 if(localNum.equals("02")) {
		//			 city="서울";
		//		 }else if(localNum.equals("032")){
		//			 city="인천";
		//		 }
		//		 
		//		 System.out.println(city+"입니다");

		String tel="02-123-4567";
		int idx=tel.indexOf("-");
		char ch=tel.charAt(5);
		String localNum=tel.substring(0,idx);
		
		String city="";
		String gu="";

		
		if(localNum.equals("02")) {
			city="서울";

			if(ch=='3') {
				gu="마포구";
			}else {
				gu="강남구";
			}
		}else if(localNum.equals("032")){
			city="인천";
		}
		System.out.println(city+"/"+gu+"입니다");


		/*
		 * 서울인 경우에 5번째 문자의 값이 3이라면 '마포구'이고
		 * 그렇지 않으면 '강남구'라고 출력
		 * */

	}

}
