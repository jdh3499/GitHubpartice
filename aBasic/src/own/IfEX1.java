package own;

import java.util.Scanner;

public class IfEX1 {

	public static void main( String [] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		int num = sc.nextInt();
		int cnt = rock(num);

		System.out.println("\n 결과:"+cnt);

	}
	static int rock(int num) {
		int cnt =0;
		if(num>=1 & num<=100000) {
			for(int i=1;i<=num;i++) {
				int a = i;
				boolean t = false;

				while(a!=0) {
					int b = a%10;
					if(b==3 | b==6 | b==9) {
						t = true;
						System.out.print("짝");
						cnt++;
					}
					a/=10;
				}
				if(!t) System.out.println(i);
				else System.out.println();
			}

		}else {
			System.out.println("1~100,000이하로 적어주세요");
		}
		return cnt;

	}
	
}
