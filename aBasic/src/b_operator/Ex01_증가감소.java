package b_operator;

public class Ex01_증가감소 {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		
		//[0]
//		System.out.println("A= "+a+"B= "+b);//A=5 B=7
//		System.out.println("A="+a+1+"B=" + b+1);
//		System.out.println("A="+(a+1)+"B=" +(b+1));
		
//		a=a+1;//a=+1
//		b=b-1;
//		System.out.println("A="+a+"B="+b);
		
		//증가연산자 ++
		//감소연산자 --
//		++a;
//		--b;
//		System.out.println("A="+a+"B="+b);
//		
//		a++;
//		b--;
//		System.out.println("A="+a+"B="+b);
//		
//		int c=10;
//		int result=++c;
//		System.out.println("결과:"+result);
//		System.out.println("c="+c);
//		
//		int d=10;
//		int result2=d++;
//		System.out.println("결과:"+result2);
//		System.out.println("d="+d);
		int x=10,y=12;
		System.out.println("X="+ ++x + ",Y=" + --y);
		System.out.println("X="+ x++ + ",Y=" + y--);
		System.out.println("X="+ x++ + ",Y=" + y--);
		System.out.println(x + y);

	}

}
