package c_control;

public class Ex06_for개념 {

	public static void main(String[] args) {
		
//		for(char ch='A'; ch<='C' ; ch++) {
//			System.out.print(ch);
//		}
//		System.out.println();
//		
//		for(char ch='Z'; ch>='A'; ch--) {
//			System.out.print(ch);
//		}
//		System.out.println();
//		for(char ch='A'; ch <='S'; ch+=2) {
//			System.out.print(ch);
//		}
//		for(int i=10; i>=1; i--) {
//			System.out.print(i);
//		}
//		//10부터 1까지
//		
//		System.out.println();
		//1부터 10까지의합
//		int sum=0;
//		for(int i=1; i<=10; i++) {
////			sum=sum+i;
//			sum+=i;
//		}
//		System.out.println("합"+sum);

		
		//1부터 100까지의  홀수의 합과 짝수의 합을 구하기
		int sum =0,sum1=0;
		for(int i=1;i<=100 ;i++) {
			if(i%2==0) {
				sum=sum+i;
			}else {
				sum1=sum1+i;
			}
		}
		System.out.println("짝수의 합은 :"+sum+" 홀수의 합은 :"+sum1);
		
		
	}

}
