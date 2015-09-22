class ThreadDemo1 extends Thread{
	//String name;
	
	public ThreadDemo1(String name) {
		//this.name = name;
		super(name);
	}
	
	@Override
	public void run() {
		int sum = 0;
		for(int i=0; i<5; i++){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum += i;
			System.out.println(getName() + " : " + sum);
			//System.out.println(Thread.currentThread().getName() + " : " + sum);
		}
	}
}

public class ThreadTest1 {
	public static void main(String[] args) {
		// TODO ������ ����1
		
		ThreadDemo1 t1 = new ThreadDemo1("ù��° �ڽĽ�����");
		ThreadDemo1 t2 = new ThreadDemo1("�ι�° �ڽĽ�����");
		
		t1.start();
		t2.start();
	}
}
