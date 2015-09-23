class Toilet{
	public synchronized void openDoor(String name, String key){
		System.out.println(name + " : ����");
		
		for(int i=0; i<100000; i++){
			if(i == 5000)
				System.out.println(name + " : ������~~~");
		}
		
		System.out.println(name + " : ��~~ �ÿ���");
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
		// TODO ����ȭ ����
		Toilet toilet = new Toilet();
		
		Family father = new Family(toilet, "�ƹ���");
		Family mother = new Family(toilet, "��Ӵ�");
		Family brother = new Family(toilet, "��");
		Family sister = new Family(toilet, "����");
		Family me = new Family(toilet, "��");
		
		father.start();
		mother.start();
		brother.start();
		sister.start();
		me.start();
	}
}
