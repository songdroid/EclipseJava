class SingletonDemo{
	private int i;
	private static SingletonDemo single = new SingletonDemo();
	
	private SingletonDemo(){}
	
	public static SingletonDemo getInstance(){
		return single;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		// TODO Singleton Pattern
		
		//SingletonDemo demo1 = new SingletonDemo();
		
		SingletonDemo demo1 = SingletonDemo.getInstance();
		SingletonDemo demo2 = SingletonDemo.getInstance();
		
		if(demo1 == demo2)
			System.out.println("주소가 같다");
		else
			System.out.println("주소가 다르다");
	}
}




