package e_method;

public class Ex02_반환 {

	public static void main(String[] args) {
		int sum=add();
		//출력
		System.out.println("합은 :"+sum );

	}
	//void는 보이콧 비슷한거임 여기 안에서 말고는 값을 안넘겨주겠다 데이터를 넘기고싶으면 변수 선언해서 retrun해줘야함
	//return도 그냥 add()이렇게만 출력 하면안되고 받아야할 메모리를 할당해줘야한다.
	static int add() {
		int a=10,b=20;
		int sum=a+b;
		return sum;
	}
	
	//return:제어권 반환
	//jvm
	//반환시 데이터를 딱 한개를 가지고 넘어갈 수 있음

}
