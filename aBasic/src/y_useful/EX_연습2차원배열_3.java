package y_useful;

public class EX_연습2차원배열_3 {

	public static void main(String[] args) {
		//5명의 학생들의 국어, 영어, 수학, 과학, 사회 점수를 이차배열 score에 저장한 경우 각 학생들의 총점과 평균을 구하시오.
		int  [] [] score = { { 98, 98, 90, 92, 99 },// 477 95.4
				             { 81, 82, 83, 84, 85 },// 415 83						
				             { 60, 65, 60, 65, 69 },// 319 63.8
				             { 77, 74, 79, 78, 72} };//380 76
//-----------------------------------------------------------------------
		int  sum[] = new int[score.length];

		/*  배열의 각각의 값을 더하는 코드 */ 
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				sum[i]+=score[i][j];
			}
		}
		for(int i=0;i<score.length;i++) {
			System.out.print(sum[i]+" ");
		}


		for(int i=0; i<score.length; i++){
			System.out.println( i+"번째 학생의 총점 " + sum[i] );
			System.out.println( i+"번째 학생의 평균 " + sum[i]/5 );			
		}

	}

}
