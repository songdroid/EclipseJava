public class CurrentTimeTest {
	public static void main(String[] args) {
		// TODO �ð��� ���� ���ϱ�(System.currentTimeMillis())
		
		long start = System.currentTimeMillis()/1000;
		
		long sum = 0;
		for(long i=0; i<10000000000L; i++){
			sum += i;
		}
		
		long end = System.currentTimeMillis()/1000;
		
		System.out.println("�ɸ� �ð� : " + (end-start) + "��");
	}
}
