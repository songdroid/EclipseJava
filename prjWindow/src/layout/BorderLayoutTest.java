package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest extends Frame{
	Button b1, b2, b3, b4, b5;
	
	public BorderLayoutTest() {
		//setLayout(new BorderLayout());
		
		b1 = new Button("첫번째 버튼");
		b2 = new Button("두번째 버튼");
		b3 = new Button("세번째 버튼");
		b4 = new Button("네번째 버튼");
		b5 = new Button("다섯번째 버튼");
		
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
