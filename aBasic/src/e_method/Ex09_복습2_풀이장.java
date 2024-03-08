package e_method;

import java.util.*;
public class Ex09_복습2_풀이장 {
	public static void main(String[] args) {
		
//		int a=3;
//		int b=4;
//
//		String c="F";
//		char ch1=c.charAt(0);
//		System.out.println(ch1);
//		
//		char[][]ch=null;//배열 선언
//		ch=new char[3][4];
//		for(int i=0;i<ch.length;i++) {
//			for(int j=0;j<ch[i].length;j++) {
//				System.out.print(ch[i][j]);
//			}
//		System.out.println();
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("n값을 입력해주세요");
		int n=sc.nextInt();
		int a=0;
		char b=65;



		if(n<=6) {
			for(int i=0;i<n;i++) {

				for(int k=0;k<=n-i-1;k++) {

					System.out.print((char)b);
					b++;
				}

//				for(int j=0;j<i;j++) {
//					System.out.print(a);
//					a++;
//				}
				System.out.println();
			}
		}else {
			System.out.println("n값이 6이상입니다. 다시 입력해주세요");

		}
	

	}
}
