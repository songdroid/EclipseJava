import java.util.ArrayList;
import java.util.Vector;

public class ListTest {
	public static void main(String[] args) {
		// TODO List�������̽� ���� Ŭ������
		
		ArrayList list1 = new ArrayList();
		list1.add("carrie");
		list1.add("kairo");
		list1.add("kabbin");
		list1.add("kairo");
		list1.add("terry");
		
		System.out.println("������ ���� : " + list1.size());
		System.out.println(list1);
		
		list1.add(2, "ȫ�浿");
		
		//list1.clear();
		list1.remove(3);
		
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		
		if(list1.contains("kairo")){
			System.out.println("������ ã�Ҵ�.");
			System.out.println(list1.indexOf("kairo") + "��° �ִ�.");
		}
		else{
			System.out.println("������ ��ã�Ҵ�.");
		}
		/////////////////////////////////////////////
		Vector v = new Vector();
		v.add("ȫ�浿");
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














