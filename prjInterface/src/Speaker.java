public class Speaker implements Volume{
	private int vol;
	
	@Override
	public void volumeUp(int size) {
		vol += size;
		System.out.println("Speaker�Ҹ��� " + size + "��ŭ �����Ǿ����ϴ�.");
		System.out.println("���� Speaker�Ҹ� ũ�� : " + vol);
	}

	@Override
	public void volumeDown(int size) {
		vol -= size;
		System.out.println("Speaker�Ҹ��� " + size + "��ŭ ���ҵǾ����ϴ�.");
		System.out.println("���� Speaker�Ҹ� ũ�� : " + vol);
	}
}
