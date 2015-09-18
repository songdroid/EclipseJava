import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
	public static void main(String[] args) {
		// TODO Date 클래스와 Calendar 클래스
		
		System.out.println(new Date());
		System.out.println(new Date().toLocaleString());
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		
		System.out.println("오늘은 " + year + "년 " + month + "월 "
			+ date + "일 " + hour + "시 입니다.");
	}
}
