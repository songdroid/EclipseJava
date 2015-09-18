import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		// TODO ���ڿ� �Ľ�(parsing)
		
		/*
		String str = "ȫ�浿, �Ӳ���, �̼���, ������, ������";
		StringTokenizer st = new StringTokenizer(str, ",");
		*/
		
		String str = "ȫ�浿, �Ӳ���/ �̼���+ ������* ������";
		StringTokenizer st = new StringTokenizer(str, ",+/*");
		
		while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken().trim());
	    }
		
		String s = "JavaTM ��� ��� ��2��:James Gosling, Bill Join, "
			+ "Gilad Bracha:����ī�� ����Ű:�Ǿ �������̼�:2000:5500";
		
		/*
		 * å ���� : ...
		 * ���� :
		 * 		...
		 * 		...
		 * 		...
		 * ���� : ...
		 * ���ǻ� : ...
		 * ���ǳ⵵ : ...
		 * ���� : ...
		 */
	}
}





