public class XorTest {
	public static void main(String[] args) {
		// TODO ������ ��ȣȭ�� ��ȣȭ
		
		String data = "x���� ȫ�浿�̴�.";
		String key = "123abc?";
		String enc = "", dec="";
		
		int cnt = 0;
		for(int i=0; i<data.length(); i++){
			cnt++;
			if(cnt == key.length())
				cnt = 0;
			
			enc = enc + (char)(data.charAt(i) ^ key.charAt(cnt));
		}
		
		System.out.println("��ȣȭ �� �� : " + enc);
	}
}

