import java.text.DecimalFormat;

public class DecimalFormatTest {
	public static void main(String[] args) {
		// TODO ���� ������ ó��
		double d1 = 2.523, d2 = 3.123;
		double result = d1 + d2;
		System.out.println(result);
		
		// Ctrl + Shift + o�� ������ �ڵ� ����Ʈ
		DecimalFormat f = new DecimalFormat("#.####");
		String strResult = f.format(result);
		System.out.println(strResult);
		
		// Wrapper Class, Filter Class
		double d = Double.parseDouble(strResult);
		System.out.println(d + 3.5);
	}
}




