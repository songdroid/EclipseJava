public class StringTest2 {
	public static void main(String[] args) {
		// TODO �޼��� ����
		
		String str1 = "Java is wonderful";
		
		System.out.println("������ ���� : " + str1.length());
		System.out.println("������ ���� : " + "java is beautiful".length());
		
		// ������ ��ġ�� �� ���ڸ� �������� �޼���
		System.out.println(str1.charAt(5));
		
		// ���� ��
		String str2 = "java";
		String str3 = "java";
		
		if(str2.equals(str3))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");
		
		if(str2 == str3) // �ּҸ� ��
			System.out.println("���� �ּ�");
		else
			System.out.println("�ٸ� �ּ�");
		
		System.out.println("java".compareTo("java"));
		System.out.println("java".compareTo("javu"));
		System.out.println("javu".compareTo("java"));
		
		// ������ ���ڳ� ���ڿ��� ��ġ�� �˷��ִ� �޼���
		String str4 = "to be or not to be";
		System.out.println(str4.indexOf("be"));
		System.out.println(str4.lastIndexOf("be"));
		System.out.println(str4.lastIndexOf("love"));
		
		// ������ ��ġ�� �ִ� ���� ���ڵ��� �������� �޼���
		String str5 = "Java is number one";
		System.out.println(str5.substring(5, 6));
		System.out.println(str5.substring(5, 7));
		System.out.println(str5.substring(5));
	}
}







