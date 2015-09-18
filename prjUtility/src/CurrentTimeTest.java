public class CurrentTimeTest {
	public static void main(String[] args) {
		// TODO 시간의 간격 구하기(System.currentTimeMillis())
		
		long start = System.currentTimeMillis()/1000;
		
		long sum = 0;
		for(long i=0; i<10000000000L; i++){
			sum += i;
		}
		
		long end = System.currentTimeMillis()/1000;
		
		System.out.println("걸린 시간 : " + (end-start) + "초");
	}
}
