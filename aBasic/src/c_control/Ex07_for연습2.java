package c_control;

import java.util.Scanner;

public class Ex07_for연습2 {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("소문자를 입력하세요->");
//		
//		String str=sc.nextLine();
//		System.out.println(str);
//		char ch=str.charAt(0);
//		System.out.println(ch);
//		for(char alpha='a'; alpha<=ch; alpha++) {
//			System.out.print(alpha);
//		}
//		System.out.println();
		//입력한 문자부터 'z'까지 출력하세요
		Scanner sc=new Scanner(System.in);
		System.out.println("소문자를 입력하세요->");
		
		String str=sc.nextLine();
		
		char ch=str.charAt(0);
		for(char i=ch; i<='z'; i++) {
			System.out.print(i);
		}
		System.out.println();
	}

}
