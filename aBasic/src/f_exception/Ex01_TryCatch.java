package f_exception;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		String[] str= {"행복하자","맛점","맑은정신"};
		try {
			for(int i=0; i<=str.length;i++) { //정상구문 비정상구문 i<str,i<=str
				System.out.println(str[i]);
				
			}
			//비정상구문이 들어옸을시에는 여기 아래는 실행안함
			System.out.println("예외가 발생할 여지가 있는 구문");
			//return 있고 없고 차이점 돌려보기
			return;
		}catch(Exception ex) {
			System.out.println("예외발생 : "+ex.getMessage());
		//무조건 실행
		}finally {
			System.out.println("무조건 실행 구문");
		}
		
		System.out.println("정상적인 종료");

	}

}
