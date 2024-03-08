package c_control;

import java.util.*;

public class Ex04_switch_전화번호 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("전화번호를 입력해주세요 -포함");
		String tel =sc.next();

		int idx=tel.indexOf('-');
//		System.out.println(idx);
		
		String localNum=tel.substring(0,idx);
//		System.out.println(localNum);
		
		String loca="";
		
		switch(localNum) {
		case "02": loca="서울입니다"; 
			break;
		case "032": loca="서울입니다"; 
		break;
		default : loca="한국인입니다";
		}
		System.out.println(localNum+"은"+loca);
	}

}
