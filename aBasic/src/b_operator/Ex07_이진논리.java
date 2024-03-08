package b_operator;

public class Ex07_이진논리 {

	public static void main(String[] args) {
		int a=15;//00001111
		int b=10;//00001010
		
		int and = a|b;
		         //a 00001111
				 //b 00001010
		         //-----------
				 //  00001010
		System.out.println(and);
		
		int xor =a^b;
		System.out.println(xor);
		//둘다신호가 다른경우에만 
		//0과 1일때만 1
        //a 00001111
		//b 00001010
        //-----------
		//  00000101

	}

}
