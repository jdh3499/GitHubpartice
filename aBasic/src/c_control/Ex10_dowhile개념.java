package c_control;

public class Ex10_dowhile개념 {
	public static void main(String[] args) {
		int sum=0;
		//1부터 10까지의 합
		//while문으로 변경
//		for(int i=1;i<=10;i++) {
//			sum+=i;	
//		}
//		System.out.println("합은"+sum);
		
		int i=1;
		do{
			sum+=i;
			i++;
		}while(i<=10);
		
		System.out.println("합은 "+sum);
	}
}
