package f_exception;

public class Ex_예제  {

	public static void main( String [] args ) {   
		try{
//			method();
//			return;
			System.exit(0);
		} finally {
			System.out.println("Finally");
		} 
	}
//	static void method(){
//		throw new Exception();
//	}

}