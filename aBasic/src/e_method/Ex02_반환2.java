package e_method;

public class Ex02_반환2 {

	public static void main(String[] args) {
		 int[] data=add();
		 
		 int sum=data[0]+data[1];
		 System.out.println("합:"+sum);
		 // 합산후 출력

	}
	
	static int[] add() {
		int a=10,b=20;
		int []data= {a,b};
		//return 값은 하나밖에 못넘긴다 두개는 못넘겨요 하지만 묶어서 넘길순 있어요
		return data;
		
	}

}
