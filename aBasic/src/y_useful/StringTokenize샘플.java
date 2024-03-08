package y_useful;

import java.util.Scanner;

import java.util.*;

public class StringTokenize샘플 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수입력->(ex)90/80/70/60/");//안녕 하이 홍길동
		String sent=sc.nextLine();
		
//		System.out.println(sent);
		//StringTokenize->단어 쪼개기
		StringTokenizer st=new StringTokenizer(sent,"/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		//ex)st.countTokens()->for()이용
		
	}
}
