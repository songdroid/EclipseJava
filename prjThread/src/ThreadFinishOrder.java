class ThreadDemo6 extends Thread{
	ThreadDemo6(String name){
		super(name);
		start();
	}
	
	@Override
	public void run() {
		System.out.println(getName() + " 자식 스레드 시작");
		int cnt = 0;
		do{
			try {
				sleep(500);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + " count : " + cnt);
			cnt++;
		}while(cnt < 10);
		System.out.println(getName() + " 자식 스레드 종료");
	}
}

public class ThreadFinishOrder {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드 예제3
		System.out.println("메인 스레드 시작");
		
		ThreadDemo6 t1 = new ThreadDemo6("first");
		ThreadDemo6 t2 = new ThreadDemo6("second");
		
		int cnt = 0;
		do{
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
			cnt++;
		}while(cnt < 10); //while(t1.isAlive() || t2.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println("메인 스레드 종료");
	}
}
