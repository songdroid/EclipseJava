public class Radio implements Volume{
	private int vol;
	
	@Override
	public void volumeUp(int size) {
		vol += size;
		System.out.println("Radio�Ҹ��� " + size + "��ŭ �����Ǿ����ϴ�.");
		System.out.println("���� Radio�Ҹ� ũ�� : " + vol);
	}

	@Override
	public void volumeDown(int size) {
		vol -= size;
		System.out.println("Radio�Ҹ��� " + size + "��ŭ ���ҵǾ����ϴ�.");
		System.out.println("���� Radio�Ҹ� ũ�� : " + vol);
	}
}
