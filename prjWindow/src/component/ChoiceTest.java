package component;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceTest extends Frame{
	Choice c;
	
	ChoiceTest(){
		c = new Choice();
		c.addItem("ȫ�浿");
		c.addItem("�Ӱ���");
		c.addItem("�ŵ���");
		
		add(c);
	}
	
	public static void main(String[] args) {
		// TODO Choice���۳�Ʈ ����
		ChoiceTest test = new ChoiceTest();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
