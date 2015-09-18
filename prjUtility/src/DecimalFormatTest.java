import java.text.DecimalFormat;

public class DecimalFormatTest {
	public static void main(String[] args) {
		// TODO 숫자 형식을 처리
		double d1 = 2.523, d2 = 3.123;
		double result = d1 + d2;
		System.out.println(result);
		
		// Ctrl + Shift + o를 눌러서 자동 임포트
		DecimalFormat f = new DecimalFormat("#.####");
		String strResult = f.format(result);
		System.out.println(strResult);
		
		// Wrapper Class, Filter Class
		double d = Double.parseDouble(strResult);
		System.out.println(d + 3.5);
	}
}




