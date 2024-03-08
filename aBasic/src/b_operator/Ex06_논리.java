package b_operator;

/*
 * 논리연산자
 * 
 * 일반논리:&&(and) ||(or)
 * 이진논리:& | ^
 * 
 * A B
 * 0 0
 * 0 1
 * 1 0
 * 1 1
 * f
 * f
 * f
 * t
 * */


public class Ex06_논리 {

	public static void main(String[] args) {
		
		int 성적 =70;
		char 태도='A';
		
		if(성적>=80&&태도=='A') {
			System.out.println("성적이 80점이상이거나 태도가 A라면 우등생");
		}else {
			System.out.println("조건만족x");
		}
	}

}
