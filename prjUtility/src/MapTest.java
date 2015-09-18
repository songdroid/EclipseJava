import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		// TODO Map인터페이스 관련 클래스
		HashMap map1 = new HashMap();
		map1.put("k01", "홍길동");
		map1.put("k02", "임꺽정");
		map1.put("k03", "임경업");
		map1.put("k04", "권율");
		map1.put("k05", "강감찬");
		
		System.out.println(map1.size());
		System.out.println(map1);
		
		System.out.println(map1.get("k02"));
		
		Set set = map1.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			System.out.println(map1.get(key));
		}
	}
}



