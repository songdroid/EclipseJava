public class StaticTest2 {
	static double d1, d2;
	
	public StaticTest2() {
		System.out.println("인스턴스 생성됨");
	}
	
	static{
		System.out.println("static 초기화");
		d1 = Math.sqrt(4.0);
		d2 = Math.sqrt(8.0);
	}
	
	public static void main(String[] args) {
		// TODO static 예제2
		new StaticTest2();
		System.out.println(d1 + ", " + d2);
	}
}
