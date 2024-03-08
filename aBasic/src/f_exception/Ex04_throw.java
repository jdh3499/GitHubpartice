package f_exception;


public class Ex04_throw {
	public static void main(String[] args) {
		try {
			readArray();	
		}catch(Exception ex){
			System.out.println("예외발생 :"+ex.getMessage());
		}
		
	}
	static void readArray() throws Exception {
		try {
			String[]msg= {"행복합시다","공부합시다","짝꿍친하게"};
			for(int i=0; i<=msg.length;i++) {
				System.out.println(msg[i]);
			}		
		}catch(Exception ex){
			throw new MyException();//일부러 예외발생시킬때->readArray로 이동
			
		}
		//예외는두가지밖에 없는데 실무갔을땐 일부러 예외를발생시켜 섹션마다 일부 발생
		//ex throw new MyException이라는 메세지가 뜨면 아 MyExcetion에서 문제가 있구나라고 인지
		//throws랑 throw차이

	}
}


