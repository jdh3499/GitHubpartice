package b_operator;

import java.util.*;

public class Ex05_비교 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//a=국어 b=영어 c=수학
	int a,b,c;
	int total;
	int avg;
	System.out.println("국어점수를 입력해주세요");
	a=sc.nextInt();
	System.out.println("영어점수를 입력해주세요");
	b=sc.nextInt();
	System.out.println("수학점수를 입력해주세요");
	c=sc.nextInt();
	
	total=(a+b+c);
	System.out.println("총점은"+total+"입니다");
	
	avg=(total/3);
	System.out.println("평균은"+avg+"입니다");
	}
}
