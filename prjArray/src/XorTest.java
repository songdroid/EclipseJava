public class XorTest {
	public static void main(String[] args) {
		// TODO 데이터 암호화와 복호화
		
		String data = "x맨은 홍길동이다.";
		String key = "123abc?";
		String enc = "", dec="";
		
		int cnt = 0;
		for(int i=0; i<data.length(); i++){
			cnt++;
			if(cnt == key.length())
				cnt = 0;
			
			enc = enc + (char)(data.charAt(i) ^ key.charAt(cnt));
		}
		
		System.out.println("암호화 된 값 : " + enc);
	}
}

