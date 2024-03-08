package d_array;

public class Ex06_로또{

	public static void main(String[] args) {
		//로또번호 생성
		int[][]lotto=new int[5][6];

		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto[i].length;j++) {
				lotto[i][j]=(int)(Math.random()*45)+1;
				//중복제거
				for(int k=0;k<j;k++) {
					if(lotto[i][k]== lotto[i][j]) {
						j--;
						break;
					}
				}


			}

		}

		//정렬
		for(int i=0; i<lotto.length;i++) {

			for(int k=lotto.length;k>0;k--) {
				for(int j=0;j<k;j++) {
					if(lotto[i][j]>lotto[i][j+1]){
						int temp=lotto[i][j];
						lotto[i][j] =lotto[i][j+1];
						lotto[i][j+1] = temp;  
					}
				}
			}
		}




		//출력
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto[i].length;j++) {
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();

		}
	}

}

