class StaticDemo{
	int i;
	double d;
	static String s;
	
	static void func1(){
		System.out.println("func1 ȣ��");
	}
}

public class StaticTest1 {
	static int j;
	
	public static void func2(){
		System.out.println("func2 ȣ��");
	}
	
	public static void main(String[] args) {
		// TODO static
		
		StaticDemo.s = "ȫ�浿";
		
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		
		System.out.println(s1.s);
		System.out.println(s2.s);
		
		s3.s = "�Ӳ���";
		
		System.out.println(s1.s);
		System.out.println(StaticDemo.s);
		
		//StaticTest1.j = 200;
		j = 200;
		
		s1.func1();
		StaticDemo.func1();
		
		func2();
	}
}
