package own;

import java.util.Scanner;

public class Ex_입사문제2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("범위를 입력해주세요");
		System.out.print("mod1: ");
		int mod1=sc.nextInt();
		System.out.print("mod2: ");
		int mod2=sc.nextInt();
		System.out.print("max_range: ");
		int max_range=sc.nextInt();

		int count=cal(mod1,mod2,max_range);
		System.out.println("값은 :"+count);
	}
	static int cal(int mod1,int mod2,int max_range) {
		int count=0;
		//부가 설명 mod1로는 나눠 떨어져도 되지만 mod2로는 나눠떨어지면안된다.
		if(mod1>=1&mod1<=100000000) {
			if(mod2>=1&mod2<=100000000) {
				if(max_range>=1&max_range<=100000000) {
					for(int i=1;i<=max_range;i++) {
						int a=i%mod1;
						int b=i%mod2;
						if(a==0&b!=0) {
							count++;
						}
						
					}
				}

			}
			
		}
		return count;
		

		
	}


}
