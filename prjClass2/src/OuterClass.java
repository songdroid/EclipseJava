/*
public class OuterClass {
	private int outer1;
	
	static class InnerClass{
		private int inner1;
		
		void innerMethod(){
			OuterClass oc = new OuterClass();
			oc.outer1 = 200;
			
			System.out.println("innerMethod ȣ�� : " + inner1);
		}
	}
	
	public static void main(String[] args) {
		// TODO ��ø Ŭ����
		
		InnerClass ic = new InnerClass();
		ic.inner1 = 100;
		ic.innerMethod();
	}
}
*/

public class OuterClass {
	private int outer1;
	
	class InnerClass{
		private int inner1;
		//static int inner2;
		
		void innerMethod(){
			outer1 = 200;
			
			System.out.println("innerMethod ȣ�� : " + inner1);
		}
	}
	
	public static void main(String[] args) {
		// TODO ��ø Ŭ����
		
		//OuterClass oc = new OuterClass();
		//InnerClass ic = oc.new InnerClass();
		
		InnerClass ic = new OuterClass().new InnerClass();
		
		ic.inner1 = 100;
		ic.innerMethod();
	}
}


