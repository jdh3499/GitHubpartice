package e_method;

public class Ex07_오버로딩 {
	public static void main(String[] args) {
//		System.out.println(1000);//int
//		System.out.println(3.999);//double
//		System.out.println('왕');//char
//		System.out.println("안녕하세요");//String
	     int i = 4,  j = 2;
	     int sum = 0;
	     int sum1=method( i, j );
	     System.out.println("sum = " +  sum1 );
		//쉬프트 연산자 개념 다시잡기
	}
	static int method( int i, int j) {
	     int sum = i + j;
	     System.out.println("sum = " +  sum );
	     return sum;
	}

}



/*오보로딩
 * -여러개의 함수가 동일 함수명 사용
 * -인자 자료형과 갯수가 다름
 * 
 * [주의] 리턴형만 다른 것은 아님
 * void test(int a){}
 * double test(int z){}
 * char test(int h){
 * }
 * 
 * 
 * 
 * 
 * 
 */