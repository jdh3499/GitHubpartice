package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch {

	
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream("abc.txt");	
			System.out.println("파일 연결");
			fis.read();
			
		}catch(FileNotFoundException ex){
			System.out.println("파일이 없는 예외 발생");
		}catch(IOException ex){
			System.out.println("파일 읽을 때 예외발생");
		}catch(Exception ex){
			System.out.println("그 외 예외 발생");
			//finally는 진짜로 실행할거 있을때만 씀
		}finally {//챕터6 읽기
			try {
				fis.close();
			}catch(Exception ex){
				
			}
			
			//에러나는 이유 지역변수라 값이없다

		}
		
		
		//fis.close();
	}

}
