package own;

public class abcc {

	public static void main(String[] args) {
		int a[][]=new  int[][]{{3,-5, 12 },
			{-2, 11, 2, -7}, 
			{21, -21, -35, -93, -11}, 
			{9, 14, 39, -98}};

			int  sum[] = new int[a.length];
			
			//각 행의 합
			for(int i=0; i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					sum[i]+=a[i][j];
				}//j끝
			}//i끝

			//출력

			
			int max=sum[0];

			for(int i=1;i<a.length;i++) {
				if(max<sum[i]) {
					max=sum[i];
				}
			}
			System.out.println("가장 큰 행 값:"+max);
	}
}


