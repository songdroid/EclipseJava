package layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutTest extends Frame{
	Button b1, b2, b3, b4, b5;
	
	public FlowLayoutTest() {
		setLayout(new FlowLayout());
		
		b1 = new Button("첫번째 버튼");
		b2 = new Button("두번째 버튼");
		b3 = new Button("세번째 버튼");
		b4 = new Button("네번째 버튼");
		b5 = new Button("다섯번째 버튼");
		
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
