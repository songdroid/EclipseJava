public class CMSExt extends CMS{
	String address;
	String tel;
	
	CMSExt(int no, String name, char level, String tel, String address){
		//this.no = no;
		//this.name = name;
		//this.level = level;
		//this.tel = tel;
		super(no, name, level, tel);
		super.tel = tel;
		this.address = address;
	}
	
	public void display(){
		super.display();
		System.out.println("∞Ì∞¥ ¡÷º“ : " + address);
	}
}
