class ThreadDemo4 implements Runnable{
	String name;
	
	public ThreadDemo4(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + " �ڽ� ������ ����");
		int cnt = 0;
		do{
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + ": count : " + cnt);
			cnt++;
		}while(cnt < 10);
		System.out.println(name + " �ڽ� ������ ����");
	}
}

public class ThreadTest4 {
	public static void main(String[] args) {
		// TODO ������ ����3
		System.out.println("���� ������ ����");
		
		ThreadDemo4 t1 = new ThreadDemo4("ù��° �ڽ�");
		ThreadDemo4 t2 = new ThreadDemo4("�ι�° �ڽ�");
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		tt1.start();
		tt2.start();
		
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
		}while(cnt < 10);
		
		System.out.println("���� ������ ����");
	}
}
