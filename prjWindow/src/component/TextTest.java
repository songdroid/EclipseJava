package component;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextTest extends Frame{
	TextArea ta;
	TextField tf;
	
	TextTest(){
		setLayout(new FlowLayout());
		
		ta = new TextArea("이것은 TextArea이다", 3, 30);
		tf = new TextField("이것은 TextField이다", 30);
		
		add(ta);
		add(tf);
	}

	public static void main(String[] args) {
		// TODO TextComponent컴퍼넌트 예제
		TextTest test = new TextTest();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
