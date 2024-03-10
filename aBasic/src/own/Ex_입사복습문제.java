package own;

import java.util.Scanner;

public class Ex_입사복습문제 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num 값 입력--->");
		int num=sc.nextInt();
		int count=jjack(num);
		System.out.println("결과 : "+count);


	}

	static int jjack(int num){
		int count=0;


		if(num>=1&num<=100000) {
			for(int i=1;i<=num;i++) {
				int a=i;
				boolean t=false;
				
				while(a!=0) {
					int b=a%10;
					if(b==3|b==6|b==9) {
						t=true;
						System.out.print("짝");
						count++;
					}
					a/=10;	
				}
				if(!t) {
					System.out.println(i);
				}else {
					System.out.println();
				}

			}


		}else {
			System.out.println("숫자범위를 1이상100,000이하로 입력해주세요");
		}
		return count;
	}

}
