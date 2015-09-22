class ThreadDemo3 extends Thread{
	@Override
	public void run() {
		System.out.println("자식 스레드 시작");
		int cnt = 0;
		do{
			try {
				sleep(500);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("count : " + cnt);
			cnt++;
		}while(cnt < 10);
		System.out.println("자식 스레드 종료");
	}
}

public class ThreadTest3 {
	public static void main(String[] args) {
		// TODO 스레드 예제3
		System.out.println("메인 스레드 시작");
		
		ThreadDemo3 t1 = new ThreadDemo3();
		t1.start();
		
		int cnt = 0;
		do{
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
			cnt++;
		}while(cnt < 10);
		
		System.out.println("메인 스레드 종료");
	}
}
