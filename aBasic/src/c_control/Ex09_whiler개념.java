package c_control;

import java.util.Scanner;

/*
 * for   : 주로 반복횟수가 정해진 경우
 * while : 주로 횟수가 고정적이지 않은 경우 */
public class Ex09_whiler개념 {

	public static void main(String[] args) {
      
//		int sum=0;
//		int i=1;
//		//for(;i<=10;) {
//		while(i<=10) {
//			sum+=i;
//			i++;
//		}
//			
//		//}
//		
//		
//		System.out.println("합="+sum);
		Scanner sc=new Scanner(System.in);
		System.out.println("단수를 입력해세요---->");
		int dan=sc.nextInt();
		int result=0;
//		for(int i=1; i<=9;i++) {
//			result=dan*i;
//			System.out.print(result+" ");
//		}
		int i=1;
		while(i<=9) {
			result=dan*i;	
//			System.out.print(dan+"*"+i+"="+result+" ");
			System.out.printf("%d * %d=%d \n",dan,i,dan*i);
			i++;
		}

	}

}
