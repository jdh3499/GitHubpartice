package d_array;


/*
 * 
 * 임의의 수(랜덤 수)
 * -Math.random() 0.0부터 1.0보다 작은 어떤수 
 *  	ex)0.000008
 *  	   0.654323
 *  	   0.500001
 *  	Math.random()*10
 * 	(int) (Math.random()*10)
 * 		ex)0
 * 		   7
 * 		   5
 * */

public class Ex04_Lotto {

	public static void main(String[] args) {
		int[] lotto =new int[6];

		//로또번호 생성->임의의 수 생성해서 저장
		for(int i=0;i<lotto.length;i++) {

			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i;j++){
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}
			}//동일수 안나오게 해보기
		}
		System.out.println(lotto.length);
		//출력하기전에 정렬해야 사용자가 보기 편함
		for(int i=lotto.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(lotto[j]>lotto[j+1]){
					int temp=lotto[j];
					lotto[j] =lotto[j+1];
					lotto[j+1] = temp;  
				}
			}
		}

		//출력
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}

	}

}
