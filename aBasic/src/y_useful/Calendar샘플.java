package y_useful;

/*
 * 날짜 관련 클래스 : java.util 패키지안에
 * 클래스종류
 * Date
 * Calendar
 * LocalDate
 * LocalDateTime
 *  
 * */
import java.util.*;


public class Calendar샘플 {

	public static void main(String[] args) {
		
		Calendar c= Calendar.getInstance();
//		int year  = c.get(Calendar.YEAR);
//		//**********************
//		//월개념 서양개념 동양개념이 다름
//		// 월개념 : 1월 ==0
//		int month = c.get(Calendar.MONTH)+1;
//		int day   = c.get(Calendar.DATE);
//		
//		System.out.println(year+"/"+month+"/"+day);
//		
//		//시,분,초 구해서 출력
//		int hour=c.get(Calendar.HOUR);
//		int minute=c.get(Calendar.MINUTE);
//		int second=c.get(Calendar.SECOND);
//		
//		System.out.println(hour+"/"+minute+"/"+second);
		String[] day_of_week= {"일","월","화","수","목","금","토"};
		int week_int=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week_int);
		//요일구하기
		System.out.println(day_of_week[week_int-1]+"요일입니다");
	}

}
