public class StringTest3 {
	public static void main(String[] args) {
		// TODO String클래스의 특징
		String str1 = "java";
		String str2 = new String("java");
		
		if(str1 == str2)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		/*
		String str3 = "jsp";
		str3 = "spring";
		str3 = "html";
		*/
		
		String str3 = "java ";
		String str4 = str3.concat("is safeful");
		System.out.println(str4);
		
		if(str3 == str4)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		StringBuffer str5 = new StringBuffer("java ");
		StringBuffer str6 = str5.append("is safeful");
		System.out.println(str6);
		
		if(str5 == str6)
			System.out.println("같다");
		else
			System.out.println("다르다");
	}
}
















