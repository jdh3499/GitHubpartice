package c_control;

import java.util.*;

public class cote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>=b) {
			if(a>=c) {
				if(b>=c) {
					System.out.println(b);
				}
				else {
					System.out.println(c);
				}
			}else {
				System.out.println(a);
			}

		}else {
			if(c<=b) {
				if(c<=a) {
					System.out.println(a);
				}else {
					System.out.println(c);
				}
		
			}else {
				System.out.println(b);
			}
		}
	}


}
