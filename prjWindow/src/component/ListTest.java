package component;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class ListTest extends Frame{
	List list1, list2;
	
	ListTest(){
		setLayout(new FlowLayout());
		
		list1 = new List(5, true);
		list2 = new List(3, false);
		
		list1.add("사과");
		list1.add("배");
		list1.add("포도");
		list1.add("감");
		list1.add("수박");
		
		list2.add("짜장면");
		list2.add("짬뽕");
		list2.add("군만두");
		list2.add("난자완스");
		list2.add("샥스핀");
		
		add(list1);
		add(list2);
	}

	public static void main(String[] args) {
		// TODO List컴퍼넌트 예제
		ListTest test = new ListTest();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
