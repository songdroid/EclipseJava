public class RecursionTest {
	public int fact1(int num){
		int result = 1;
		
		for(int i=1; i<=num; i++){
			result *= i;
		}
		
		return result;
	}
	
	public int fact2(int num){
		int result = 0;
		
		if(num == 1)
			return 1;
		
		result = fact2(num-1) * num;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO ��� ȣ��
		
		RecursionTest obj = new RecursionTest();
		System.out.println("�ݺ��� ��� : " + obj.fact1(4));
		System.out.println("��� ȣ�� ��� : " + obj.fact2(4));
	}
}
