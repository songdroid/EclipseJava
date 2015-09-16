class A{
	A(){
		System.out.println("A클래스의 인스턴스 생성");
	}
}

class B extends A{
	/*
	B(){
		System.out.println("B클래스의 인스턴스 생성");
	}
	*/
	B(){}
	B(int i){
		System.out.println(i);
	}
}

class C extends B{
	C(){
		System.out.println("C클래스의 인스턴스 생성");
	}
}

public class CallOrder {
	public static void main(String[] args) {
		// TODO 생성자의 호출 순서
		
		new C();
	}
}
