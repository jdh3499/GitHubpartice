package y_useful;

public class EX_연습2차원배열_1 {

	public static void main(String[] args) {
		int [ ] arr = { 66, 55, 44, 33, 22, 11 };
		int  sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}

		/*  배열의 각각의 값을 더하는 코드 */ 

		System.out.println( "sum = " + sum );
	}


}


