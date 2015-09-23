package component;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceTest extends Frame{
	Choice c;
	
	ChoiceTest(){
		c = new Choice();
		c.addItem("홍길동");
		c.addItem("임걱정");
		c.addItem("신돌석");
		
		add(c);
	}
	
	public static void main(String[] args) {
		// TODO Choice컴퍼넌트 예제
		ChoiceTest test = new ChoiceTest();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
