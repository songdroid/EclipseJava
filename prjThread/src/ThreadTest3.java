class ThreadDemo3 extends Thread{
	@Override
	public void run() {
		System.out.println("�ڽ� ������ ����");
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
		System.out.println("�ڽ� ������ ����");
	}
}

public class ThreadTest3 {
	public static void main(String[] args) {
		// TODO ������ ����3
		System.out.println("���� ������ ����");
		
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
		
		System.out.println("���� ������ ����");
	}
}
