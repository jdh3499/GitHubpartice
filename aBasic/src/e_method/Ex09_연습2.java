package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex09_연습2 {

	public static void main(String[] args) {
		int score[]=input();
		int data1[]=getCalc(score);

		output(data1);

	}
	//역할 : 국영수 점수를 입력받기
	static int[] input(){
		Scanner input=new Scanner(System.in);
		System.out.println("국영수 점수를 입력해주세요 ex(100/90/80)--->");
		//input.next();
		String str=input.nextLine();
		StringTokenizer st= new StringTokenizer(str,"/");
		
		int kor =Integer.parseInt(st.nextToken()) ;
		int eng =Integer.parseInt(st.nextToken()) ;
		int math =Integer.parseInt(st.nextToken()) ;
		
		int score[]= {kor,eng,math};
		
		return score;
		
	}
	// 역할 : 입력받은 국영수 점수로 총점과 평균을 구해서 출력
	static int[] getCalc(int[]score) {
		int kor=score[0];
		int eng=score[1];
		int math=score[2];
		
		int total=kor+eng+math;
		int avg=total/3;
		

		int data1[]= {total,avg};
		
		return data1;
	}
	// 역할 : 평균값을 받아서 학점 구하기
	static void output(int data1[]) {
		System.out.println("총점"+data1[0]+"평균은"+data1[1]);
	}

}
