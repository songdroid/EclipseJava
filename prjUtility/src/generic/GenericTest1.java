package generic;

import java.util.Vector;

public class GenericTest1 {
	public static void main(String[] args) {
		// TODO generic�� ù��° �뵵
		Vector<String> vec = new Vector<String>();
		vec.add("hellow");
		vec.add("world");
		vec.add("ȫ�浿");
		
		//...
		
		// vec.add(100);
		
		/*
		String str = null;
		for(int i=0; i<vec.size(); i++){
			//str = (String)vec.get(i);
			str = vec.get(i);
			System.out.println(str);
		}
		*/
		
		// for(���� : �迭 �Ǵ� �÷���)
		for(String str : vec){
			System.out.println(str);
		}
	}
}




