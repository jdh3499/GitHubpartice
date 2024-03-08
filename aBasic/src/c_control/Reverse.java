package c_control;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자를 입력해주세요--->");
		String str=sc.nextLine();
		
//		char ch=str.charAt(str.length()-1);
//		System.out.println(ch);

		for(int j=1; j<str.length()+1;j++) {
			char ch=str.charAt((str.length()-j));
			System.out.print(ch);

		}
	}

}
