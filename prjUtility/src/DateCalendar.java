import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
	public static void main(String[] args) {
		// TODO Date Ŭ������ Calendar Ŭ����
		
		System.out.println(new Date());
		System.out.println(new Date().toLocaleString());
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		
		System.out.println("������ " + year + "�� " + month + "�� "
			+ date + "�� " + hour + "�� �Դϴ�.");
	}
}
