// inter1.java
interface inter1{
	int a = 10;	// public static final int a = 10;
}

// inter2.java
interface inter2{
	int b = 20;
}

// inter3.java
interface inter3 extends inter1, inter2{
	int c = 30;
	
	void interMethod();
}

/*
public class InterfaceTest implements inter1, inter2{
	public static void main(String[] args) {
		// TODO 인터페이스의 기본적인 문법 예제
		System.out.println(inter1.a);
		//inter1.a = 100;
		
		System.out.println(a + ", " + b + ", " + inter3.c);
	}
}
*/

public class InterfaceTest implements inter3{
	public static void main(String[] args) {
		// TODO 인터페이스의 기본적인 문법 예제
		System.out.println(inter1.a);
		//inter1.a = 100;
		
		System.out.println(a + ", " + b + ", " + c);
	}
	
	public void interMethod(){
		
	}
}




