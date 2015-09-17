class First{
	int a = 10;
	
	void display(){
		System.out.println("a : " + a);
	}
}

class Second extends First{
	int b = 20;
	
	void display(){
		System.out.println("b : " + b);
	}
}

public class ReferenceTest {
	public static void main(String[] args) {
		// TODO 부모클래스와 자식클래스의 참조관계
		
		First f1 = new First();
		f1.display();
		
		First f2 = f1;
		f2.display();
		
		Second s1 = new Second();
		s1.display();
		
		//f2 = s1;
		
		f2 = s1;
		f2.a = 30;
		f2.display();
		System.out.println(s1.a);
		//s1 = (Second)f1;
		
		//f2.b = 40;
	}
}






