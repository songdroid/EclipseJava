package event;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;

public class ItemEventTest2 extends Frame{
	private String[] items = {"서울", "인천", "수원", "경기", "독도"};
	Choice choice;
	TextArea area;
	List list;
	Panel p;
	Button b;
	
	public ItemEventTest2() {
		addWindowListener(new WindowClose());
		choice = new Choice();
		area = new TextArea();
		list = new List();
		p = new Panel();
		b = new Button("list 출력");
		
		p.add(choice);
		p.add(list);
		p.add(b);
		
		add("North", p);
		add("Center", area);
		
		for(String s : items){
			choice.addItem(s);
			list.add(s);
		}
		
		list.setMultipleMode(true);
	}
	
	public static void main(String[] args) {
		ItemEventTest2 test = new ItemEventTest2();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
