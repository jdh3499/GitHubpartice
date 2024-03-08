package own;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		System.out.println("과일명 : ");
		
		Scanner sc=new Scanner(System.in);
		
		String Fruit=sc.next();
		String res;
		
		if(Fruit.equals("포도"))
			res="달다";
		else if(Fruit.equals("수박"))
			res="시원하다";
		else if(Fruit.equals("딸기"))
			res="맛있다";
		else
			res="기타";
		System.out.println(res);

	}

}
