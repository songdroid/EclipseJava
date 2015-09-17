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
		System.out.println("°í°´¹øÈ£ : " + no);
		System.out.println("°í°´ÀÌ¸§ : " + name);
		System.out.println("°í°´·¹º§ : " + level);
		System.out.println("°í°´ÀüÈ­ : " + tel);
	}
}
