package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest extends Frame{
	Button b1, b2, b3, b4, b5;
	
	public BorderLayoutTest() {
		//setLayout(new BorderLayout());
		
		b1 = new Button("ù��° ��ư");
		b2 = new Button("�ι�° ��ư");
		b3 = new Button("����° ��ư");
		b4 = new Button("�׹�° ��ư");
		b5 = new Button("�ټ���° ��ư");
		
		add("North", b1);
		add("South", b2);
		add("West", b3);
		add("East", b4);
		add("Center", b5);
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
