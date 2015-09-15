public class StringTest1 {
	public static void main(String[] args) {
		// TODO String클래스 예제1
		String name1 = new String(); 
		name1 = "홍길동";
		System.out.println(name1);
		
		String name2 = new String("임꺽정");
		System.out.println(name2);
		
		String name3 = "강감찬";
		System.out.println(name3);
		
		/*
		char[][] names = new char[3][3];
		names[0][0] = '홍';
		names[0][1] = '길';
		names[0][2] = '동';
		...
		*/
		
		/*
		char[][] names = {	{'홍', '길', '동'}, 
							{'임', '꺽', '정'}, 
							{'강', '감', '찬'}};
		
		for(int i=0; i<names.length; i++){
			for(int j=0; j<names.length; j++){
				System.out.print(names[i][j]);
			}
			System.out.println();
		}
		*/
		
		String[] names = {"홍길동", "임꺽정", "강감찬"};
		for(int i=0; i<names.length; i++)
			System.out.println(names[i]);
	}
}








