package y_useful;

import java.util.*;

public class 연습 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("n값을 입력해주세요");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print("*");
			}	
			for(int k=1;k<i+2;k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
