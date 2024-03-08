package z_recursive;

public class FactorialTest {

	public static void main(String[] args) {
		// 5! = 5*4*3*2*1;
		int sum=0;
		sum=sumFunc(5);
		System.out.println("총 합"+sum);
		

		
	}
	static int sumFunc(int i) {
		if(i==1) return 1;
		return i*sumFunc(i-1);
	}

}
