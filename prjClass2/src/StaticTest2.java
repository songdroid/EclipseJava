public class StaticTest2 {
	static double d1, d2;
	
	public StaticTest2() {
		System.out.println("�ν��Ͻ� ������");
	}
	
	static{
		System.out.println("static �ʱ�ȭ");
		d1 = Math.sqrt(4.0);
		d2 = Math.sqrt(8.0);
	}
	
	public static void main(String[] args) {
		// TODO static ����2
		new StaticTest2();
		System.out.println(d1 + ", " + d2);
	}
}
