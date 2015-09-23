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
		
		list1.add("���");
		list1.add("��");
		list1.add("����");
		list1.add("��");
		list1.add("����");
		
		list2.add("¥���");
		list2.add("«��");
		list2.add("������");
		list2.add("���ڿϽ�");
		list2.add("������");
		
		add(list1);
		add(list2);
	}

	public static void main(String[] args) {
		// TODO List���۳�Ʈ ����
		ListTest test = new ListTest();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
