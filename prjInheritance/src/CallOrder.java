class A{
	A(){
		System.out.println("AŬ������ �ν��Ͻ� ����");
	}
}

class B extends A{
	/*
	B(){
		System.out.println("BŬ������ �ν��Ͻ� ����");
	}
	*/
	B(){}
	B(int i){
		System.out.println(i);
	}
}

class C extends B{
	C(){
		System.out.println("CŬ������ �ν��Ͻ� ����");
	}
}

public class CallOrder {
	public static void main(String[] args) {
		// TODO �������� ȣ�� ����
		
		new C();
	}
}
