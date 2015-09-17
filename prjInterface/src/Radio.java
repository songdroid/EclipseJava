public class Radio implements Volume{
	private int vol;
	
	@Override
	public void volumeUp(int size) {
		vol += size;
		System.out.println("Radio소리가 " + size + "만큼 증가되었습니다.");
		System.out.println("현재 Radio소리 크기 : " + vol);
	}

	@Override
	public void volumeDown(int size) {
		vol -= size;
		System.out.println("Radio소리가 " + size + "만큼 감소되었습니다.");
		System.out.println("현재 Radio소리 크기 : " + vol);
	}
}
