package d_array;

import java.util.*;

public class Ex02_최대값찾기 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("입력하실 숫자개수를 입력해주세요 ->");
		int cnt=sc.nextInt();


		int [] score=new int[cnt];
		for(int i=0; i<score.length;i++) {
			System.out.println(i+"번째 숫자를 입력해주세요->");
			score[i]=sc.nextInt();

		}
		
		int max=score[0];

		for(int i=1;i<score.length;i++) {
			if(max<score[i]) {
				max=score[i];
			}
		}
		System.out.println("가장 큰 값:"+max);

	}


}
