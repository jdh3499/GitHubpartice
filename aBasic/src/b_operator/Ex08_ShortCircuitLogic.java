package b_operator;


/*Short Circuit Logic(단락 회로 평가)은 논리 연산에서 사용되는 개념입니다. 
 *이는 논리 연산자인 논리곱(AND, &&)과 논리합(OR, ||)에서 적용됩니다.
논리곱(AND)의 경우, 첫 번째 피연산자가 false일 경우 두 번째 피연산자의 값에 상관없이 
결과는 항상 false입니다. 따라서 두 번째 피연산자는 평가되지 않고 넘어갑니다. **자바만해당함
일반논리 연산자에서 발생하는 개념
앞의 조건에의해 결과가 정해지면 뒤에 조건을 실행하지 않음
*/

/*
 * 첫 번째 if 문에서 a > 3 & ++a > 3는 이진 논리 연산자 &를 사용하여 두 개의 피연산자를 평가합니다.
 *  & 연산자는 두 개의 피연산자를 모두 평가하여 결과를 도출합니다.

두 번째 if 문에서 a > 1 | ++a > 3는 이진 논리 연산자 |를 사용하여 두 개의 피연산자를 평가합니다. 
| 연산자는 두 개의 피연산자 중 하나만 true이면 전체 조건을 true로 판단합니다.
 *
  
  
  */


public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {

		int a=3;
		//일반논리연산자 대신 이진논리연산자를 사용한다면???
		//
		if(a>3&++a>3) {
			System.out.println("조건만족");
		}
		
		System.out.println("A="+a);
		
		if(a>1|++a>3) {
			System.out.println("조건만족2");
		}
		System.out.println("A="+a);

//		if(a>3&&++a>3) {
//			System.out.println("조건만족");
//		}
//		
//		System.out.println("A="+a);
//		
//		if(a>1&&++a>3) {
//			System.out.println("조건만족2");
//		}
//		System.out.println("A="+a);
//
	}

}
