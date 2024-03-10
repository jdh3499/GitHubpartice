package own;

import java.util.Scanner;

public class Ex_입사문제1 {

	public static void main(String[] args) {
		//369게임
		Scanner sc=new Scanner(System.in);//스캐너로 입력받기
		System.out.println("몇번 받을건지 입력해주세요");//num설정
		int num=sc.nextInt();//num 입력받기
		int count=jjack(num);//짝 메소드 호출 및 num값 삽입 count값 받기

		System.out.println("결과:"+count);//출력


	}
	static int jjack(int num) {
		int count=0;//카운트 초기화

		if(num>=1&num<=100000)//범위 설정{
			for(int i=1;i<=num;i++) {
				int a=i;
				boolean t=false;

				while(a!=0) {
					int b=a%10;
					if(b==3|b==6|b==9) {
						t= true;
						System.out.print("짝");
						count++;
					}
					a/=10;
				}
				if(!t)System.out.println(i);//부정의 부정은 긍정이니까 즉 369에 해당안하니까 출력
				else System.out.println();//이미 while문 안에서 true로되고 짝쳤으니까 출력
	

		}else{
			System.out.println("1~100,000이하로 적어주세요");
		}
		return count;


	}


}
