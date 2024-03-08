package d_array;

public class Ex06_로또2 {

	public static void main(String[] args) {
		//로또 번호 생성
		int lotto[][]=new int[5][6];//로또 자동 기준 5줄씩 각줄 6개의 숫자 
		
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto[i].length;j++){
				lotto[i][j]=(int)(Math.random()*45+1);
				//중복제거
				for(int k=0; k<j;k++) {
					if(lotto[i][k]==lotto[i][j]) {
						j--;
						break;
					}
				}

			}
		}
		
		
		//정렬
		for(int k=0; k<lotto.length;k++) {
			
			
			for(int i=lotto.length; i>0;i--) {
				for(int j=0;j<i;j++) {
					if(lotto[k][j]>lotto[k][j+1]) {
						int temp=lotto[k][j];
						lotto[k][j]=lotto[k][j+1];
						lotto[k][j+1]=temp;
					}
					
				}
			}
		}
			
		
		//출력
		for(int i=0; i<lotto.length;i++) {
			for(int j=0; j<lotto[i].length;j++) {
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}


	}

}
