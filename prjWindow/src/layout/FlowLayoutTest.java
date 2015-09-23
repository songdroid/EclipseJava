package layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutTest extends Frame{
	Button b1, b2, b3, b4, b5;
	
	public FlowLayoutTest() {
		setLayout(new FlowLayout());
		
		b1 = new Button("ù��° ��ư");
		b2 = new Button("�ι�° ��ư");
		b3 = new Button("����° ��ư");
		b4 = new Button("�׹�° ��ư");
		b5 = new Button("�ټ���° ��ư");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
}
