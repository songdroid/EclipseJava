public class CommandTest {
	public static void main(String[] args) {
		// TODO 명령행 인자 테스트
		
		//System.out.println(args[0] + ", " + args[1]);
		
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
	}
}

/*
 * 실행 예시)
 * java PhoneBook 홍길동
 * 
 * 홍길동	111-1111	서울시 강남구
 * *****************************************
 * String data[][] = {
 * 		{"홍길동", "111-1111", "서울시 강남구"},
 * 		{"임꺽정", "222-2222", "서울시 종로구"},
 * 		{"신사임당", "333-3333", "서울시 도봉구"}
 * };
 */











