import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		// TODO Map�������̽� ���� Ŭ����
		HashMap map1 = new HashMap();
		map1.put("k01", "ȫ�浿");
		map1.put("k02", "�Ӳ���");
		map1.put("k03", "�Ӱ��");
		map1.put("k04", "����");
		map1.put("k05", "������");
		
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



