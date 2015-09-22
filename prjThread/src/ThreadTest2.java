class ThreadDemo2 implements Runnable{
	String name;
	
	public ThreadDemo2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		int sum = 0;
		for(int i=0; i<5; i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum += i;
			System.out.println(name + " : " + sum);
			//System.out.println(Thread.currentThread().getName() + " : " + sum);
		}
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		// TODO ������ ����2
		
		ThreadDemo2 t1 = new ThreadDemo2("ù��° �ڽĽ�����");
		ThreadDemo2 t2 = new ThreadDemo2("�ι�° �ڽĽ�����");
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		
		tt1.start();
		tt2.start();
	}
}
