class Toilet{
	public synchronized void openDoor(String name, String key){
		System.out.println(name + " : 입장");
		
		for(int i=0; i<100000; i++){
			if(i == 5000)
				System.out.println(name + " : 끄으응~~~");
		}
		
		System.out.println(name + " : 아~~ 시원해");
	}
}

class Family extends Thread{
	Toilet toilet;
	String who;
	String key;
	
	Family(Toilet t, String w){
		toilet = t;
		who = w;
	}

	@Override
	public void run() {
		toilet.openDoor(who, key);
	}
}

public class SynchronizeTest {
	public static void main(String[] args) {
		// TODO 동기화 예제
		Toilet toilet = new Toilet();
		
		Family father = new Family(toilet, "아버지");
		Family mother = new Family(toilet, "어머니");
		Family brother = new Family(toilet, "형");
		Family sister = new Family(toilet, "누나");
		Family me = new Family(toilet, "나");
		
		father.start();
		mother.start();
		brother.start();
		sister.start();
		me.start();
	}
}
