public class CMS {
	private int no;
	private String name;
	private char level;
	String tel;
	
	public CMS(){}
	public CMS(int no, String name, char level, String tel){
		this.no = no;
		this.name = name;
		this.level = level;
		this.tel = tel;
	}
	
	public void display(){
		System.out.println("����ȣ : " + no);
		System.out.println("���̸� : " + name);
		System.out.println("������ : " + level);
		System.out.println("����ȭ : " + tel);
	}
}
