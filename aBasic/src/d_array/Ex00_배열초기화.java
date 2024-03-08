package d_array;

/*
 * 변수선언
 * int a;
 * 값지정
 * a=10;
 * 
 * 
 * 초기화
 * int b=5;
 * 
 * 
 * */
public class Ex00_배열초기화 {

	public static void main(String[] args) {
		//배열변수 선언 + //배열 객체 생성
		int [] kor=new int[5];
		int[]kor1= {99,88,77,66,55};
		
//		kor[0]=99;
//		kor[1]=88;
//		kor[2]=77;
//		kor[3]=66;
//		kor[4]=55;
//		kor[5]=100;
		
		
		int total=0;
		for(int i=0;i<kor.length;i++) {
			total+=kor[i];
		}
		System.out.println("총점:"+total);

	}

}
