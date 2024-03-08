package y_useful;

public class EX_연습2차원배열_2 {

	public static void main(String[] args) {
		int[][]arr = {  { 90, 90, 90, 90, 90 },//450
						{ 80, 80, 80, 80, 80 },//400
						{ 70, 70, 70, 70, 70 },//350
						{ 60, 60, 60, 60, 60 } };//300
				
		int  sum = 0;

/*  배열의 각각의 값을 더하는 코드 */ 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				 sum=sum+arr[i][j];
			}
		}
		System.out.println( "sum = " + sum );

	}

}
