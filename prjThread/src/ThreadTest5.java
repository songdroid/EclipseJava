class ThreadDemo5 implements Runnable{
	String name;
	Thread thr;
	
	ThreadDemo5(String name){
		this.name = name;
		thr = new Thread(this);
		thr.start();
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println(name + " : " + i);
		}
	}
}

public class ThreadTest5 {
	public static void main(String[] args) {
		// TODO 스레드 과제
		ThreadDemo5 t1 = new ThreadDemo5("first");
		ThreadDemo5 t2 = new ThreadDemo5("second");
		ThreadDemo5 t3 = new ThreadDemo5("third");
	}
}

/*
 * 두번째 과제
 * -----------
 * 예시)
 * 		입력 : 1 2 3 4 5
 * 			잠시 기다려 주세요 *****(별이 1초간격으로 출력)
 * 		결과 : 15
 */
















