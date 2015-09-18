import java.util.*;


public class SetTest {
	public static void main(String[] args) {
		// TODO Set인터페이스 관련 클래스
		HashSet set1 = new HashSet();
		set1.add("carrie");
		set1.add("kabbin");
		set1.add("kairo");
		set1.add("kairo");
		set1.add("kariss");
		
		System.out.println("데이터 개수 : " + set1.size());
		System.out.println(set1);
		
		TreeSet set2 = new TreeSet();
		set2.add("juliet");
		set2.add("terry");
		set2.add("kabbin");
		set2.add("terry");
		set2.add("carrie");
		
		System.out.println("데이터 개수 : " + set2.size());
		System.out.println(set2);
		
		Iterator it = set2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}







