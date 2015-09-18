import java.util.ArrayList;
import java.util.Vector;

public class ListTest {
	public static void main(String[] args) {
		// TODO List인터페이스 관련 클래스들
		
		ArrayList list1 = new ArrayList();
		list1.add("carrie");
		list1.add("kairo");
		list1.add("kabbin");
		list1.add("kairo");
		list1.add("terry");
		
		System.out.println("데이터 갯수 : " + list1.size());
		System.out.println(list1);
		
		list1.add(2, "홍길동");
		
		//list1.clear();
		list1.remove(3);
		
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		
		if(list1.contains("kairo")){
			System.out.println("데이터 찾았다.");
			System.out.println(list1.indexOf("kairo") + "번째 있다.");
		}
		else{
			System.out.println("데이터 못찾았다.");
		}
		/////////////////////////////////////////////
		Vector v = new Vector();
		v.add("홍길동");
		v.add(100);
		v.add(3.14);
		v.add(true);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.trimToSize();
		System.out.println(v.capacity());
	}
}














