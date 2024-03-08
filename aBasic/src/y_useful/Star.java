package y_useful;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		while(true){
			Scanner s = new Scanner(System.in);
			System.out.println("삼각형의 길이와 종류 입력 => ");
			int a = s.nextInt();
			int b = s.nextInt();
			if(b == 1){

			for(int i = 0; i < a; i++){
			for(int j = 0; j <= i; j++){
			System.out.print("*");
			}
			System.out.println();
			}
			break;
			}else if(b == 2) {

			for(int i = 0; i < a; i++){
			for(int j = a; j > i; j--){
			System.out.print("*");
			}
			System.out.println();
			} break;

			}else if(b == 3){
			for(int i = 1; i < a*2; i+=2) {
			for(int j = a*2-1; j > i; j-=2){
			System.out.print(" ");
			}

			for(int j = 0; j < i; j++){

			System.out.print("*");
			}

			System.out.println();
			} break;
			}else
			{System.out.println("INPUT ERROR"); continue;}



			}

	}

}
