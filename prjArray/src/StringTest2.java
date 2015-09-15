public class StringTest2 {
	public static void main(String[] args) {
		// TODO 메서드 사용법
		
		String str1 = "Java is wonderful";
		
		System.out.println("글자의 길이 : " + str1.length());
		System.out.println("글자의 길이 : " + "java is beautiful".length());
		
		// 선택한 위치의 한 문자를 가져오는 메서드
		System.out.println(str1.charAt(5));
		
		// 값의 비교
		String str2 = "java";
		String str3 = "java";
		
		if(str2.equals(str3))
			System.out.println("같은 값");
		else
			System.out.println("다른 값");
		
		if(str2 == str3) // 주소를 비교
			System.out.println("같은 주소");
		else
			System.out.println("다른 주소");
		
		System.out.println("java".compareTo("java"));
		System.out.println("java".compareTo("javu"));
		System.out.println("javu".compareTo("java"));
		
		// 지정한 문자나 문자열의 위치를 알려주는 메서드
		String str4 = "to be or not to be";
		System.out.println(str4.indexOf("be"));
		System.out.println(str4.lastIndexOf("be"));
		System.out.println(str4.lastIndexOf("love"));
		
		// 선택한 위치에 있는 여러 문자들을 가져오는 메서드
		String str5 = "Java is number one";
		System.out.println(str5.substring(5, 6));
		System.out.println(str5.substring(5, 7));
		System.out.println(str5.substring(5));
	}
}







