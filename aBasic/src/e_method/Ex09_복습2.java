package e_method;
//https://www.youtube.com/watch?v=pGV4_rpmS5o 유튜브 깃허브 관리방법
import java.util.*;

public class Ex09_복습2 {

	public static void main(String[] args) {
		char [][]ch =input();
		output(ch);


	}
	/**
	 * 역할 : 두 정수와 알파벳 문자 하나를 입력받음 
	 * 두정수와 알파벳 문자 하나를 입력=>
	 *  입력값 3 4 F 
	 * @return 
	 **/
	static char[][] input() {
		Scanner input=new Scanner(System.in);
		System.out.println("정수 두개와 알파벳 문자하나를 입력해주세요--->");
		int a=input.nextInt();
		int b=input.nextInt();

		String c=input.next();
		char ch1=c.charAt(0);


		char[][] ch=makeSquare(a,b,ch1);
		return ch;
	}


	/**
	 * makeSquare()함수안에서 생성한 문자배열에 저장된 문자를 화면에 출력하는*/
	static void output(char[][]ch) {
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
	}
	/*
	 *makeSquare();애의 역할은 iput함수에서 입력받은 첫번째 정수만큼의 행과
	 *두번째 정수만큼의 열의 배열을 만들어서
	 *입력받은 문자로 시작하는 배열값을 저장합니다.
	 *
	 * [예] [3][4]F부터시작
	 * 		FGHI
	 * 		JKLM
	 * 		NOPQ
	 *  
	 * 
	 * */

	static char[][] makeSquare(int a,int b,char ch1) {
		char[][]ch=new char[a][b];
		//  char[][]ch=new char[3][4];
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				ch[i][j] = ch1++;
			}
		}

		return ch;


	}

}

