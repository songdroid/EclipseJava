import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		// TODO 문자열 파싱(parsing)
		
		/*
		String str = "홍길동, 임꺽정, 이순신, 유관순, 강감찬";
		StringTokenizer st = new StringTokenizer(str, ",");
		*/
		
		String str = "홍길동, 임꺽정/ 이순신+ 유관순* 강감찬";
		StringTokenizer st = new StringTokenizer(str, ",+/*");
		
		while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken().trim());
	    }
		
		String s = "JavaTM 언어 사양 제2판:James Gosling, Bill Join, "
			+ "Gilad Bracha:무라카미 마사키:피어슨 에듀케이션:2000:5500";
		
		/*
		 * 책 제목 : ...
		 * 저자 :
		 * 		...
		 * 		...
		 * 		...
		 * 역자 : ...
		 * 출판사 : ...
		 * 출판년도 : ...
		 * 가격 : ...
		 */
	}
}





