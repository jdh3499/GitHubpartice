package c_control;


/*
 *문제
 *1부터 50까지 숫자 중에서 3.6.9게임처럼
 * 3,6,9 숫자를 포함하면 그 갯수만큼 "짝" 글자를 출력하고
 * 그렇지 않으면 그 숫자를 출력한다.
 * ex)
 * 3->짝
 * 32->짝
 * 33-> 짝짝
 * 36-> 짝짝
 * 369->짝짝짝
 * 
 * */


public class 중요_369 {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			int su=i;//->수가 1부터 50까지 를 출력
//			System.out.println(i);
			boolean su369=false;//su369라는 변수에 논리연산자 false를 대입
			//이숫자가 369에 걸렷는지 안걸렷는지 체킹하기 위해서 boolean사용
			while(su!=0) {
				int na=su%10;//su가 0이아닐때 까지 반복
				if(na==3|na==6|na==9) {
					System.out.print("짝");
					su369=true;
				}
				su/=10;//su=su/10; 계속 반복
			}
			if(!su369) System.out.println(i);
			else System.out.println();
		
		}
	}

}
