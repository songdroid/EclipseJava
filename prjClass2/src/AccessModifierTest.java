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
		// TODO AccessModifier �׽�Ʈ
		
		AccessDemo hong = new AccessDemo();
		hong.no = 1111;
		hong.name = "ȫ�浿";
		hong.setPay(1000000);
		
		System.out.println("��� : " + hong.no);
		System.out.println("�̸� : " + hong.name);
		System.out.println("���� : " + hong.getPay());
	}
}
