package d_array;

import java.util.*;

public class Ex01_성적 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("학생수를 입력하세요 ->");
		int cnt=sc.nextInt();


		int [] score=new int[cnt];
		for(int i=0; i<score.length;i++) {
			System.out.println(i+"번 학생의 국어점수를 입력하세요->");
			score[i]=sc.nextInt();

		}
		//총점구하기
		int total = 0;
		int avg=0;
		for(int i=0; i<score.length;i++) {
			total=total+score[i];
			avg=total/cnt;
		}

		System.out.println("총점은 :"+total+"평균은 :"+avg);
	}

}
