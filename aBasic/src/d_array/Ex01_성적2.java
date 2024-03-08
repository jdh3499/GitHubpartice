package d_array;
/*
 * 5명의 국어점수를 입력하세요(입력예시:10/10/10/10/10/)->55/66/75/69/72
 * 총점은 xxxxx이고 평균은 ㅇㅇㅇㅇ입니다.
 * 
 * 
 * */
import java.util.*;
public class Ex01_성적2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수입력->(ex)10/10/10/10/10");//안녕 하이 홍길동
		String score_str=sc.nextLine();
		//여기까지 score_str을 입력받음
		
		StringTokenizer store=new StringTokenizer(score_str,"/");//문자 "/"이걸로 구별함
		
		int cnt=store.countTokens();
		System.out.println("갯수"+cnt);//개수 나오는거
		
		int score[]=new int[cnt];//cnt에 5를 대입 ->socre배열의 크기가 5인 방을 생성
		
		
		for(int i=0;i<cnt;i++) {
			score[i]=Integer.parseInt(store.nextToken());//score를cnt크기만큼 각각 토큰을 배열안에 저장 문자열이기 때문에
			//Integer.parseInt로 형변환
		}
		//나머지 밑에는 동일
		
		int total = 0;
		int avg=0;
		for(int i=0; i<score.length;i++) {
			total=total+score[i];
			avg=total/cnt;
		}

		System.out.println("총점은 :"+total+"평균은 :"+avg);

		

	}

}
