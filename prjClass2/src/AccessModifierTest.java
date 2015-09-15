class AccessDemo{
	public int no;
	public String name;
	private double pay;
	
	void setPay(double p){
		pay = p;
	}
	
	double getPay(){
		return pay;
	}
}

public class AccessModifierTest {
	public static void main(String[] args) {
		// TODO AccessModifier 테스트
		
		AccessDemo hong = new AccessDemo();
		hong.no = 1111;
		hong.name = "홍길동";
		hong.setPay(1000000);
		
		System.out.println("사번 : " + hong.no);
		System.out.println("이름 : " + hong.name);
		System.out.println("점수 : " + hong.getPay());
	}
}
