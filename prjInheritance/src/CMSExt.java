public class CMSExt extends CMS{
	String address;
	
	CMSExt(int no, String name, char level, String tel, String address){
		this.no = no;
		this.name = name;
		this.level = level;
		this.tel = tel;
		this.address = address;
	}
	
	void print(){
		display();
		System.out.println("∞Ì∞¥ ¡÷º“ : " + address);
	}
}
