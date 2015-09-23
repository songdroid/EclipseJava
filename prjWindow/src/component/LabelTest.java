package component;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

/*
public class LabelTest {
	Label lab1, lab2, lab3;
	Frame f;
	
	LabelTest(){
		lab1 = new Label("첫번째 라벨");
		lab2 = new Label("두번째 라벨");
		lab3 = new Label("세번째 라벨");
		
		f = new Frame("라벨 연습 프로그램");
		f.setLayout(new FlowLayout());
		
		f.add(lab1);
		f.add(lab2);
		f.add(lab3);
		
		lab1.setBackground(Color.blue);
		lab2.setBackground(Color.PINK);
		lab3.setBackground(Color.GREEN);
		
		f.setSize(300, 400);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Label컴퍼넌트 테스트
		new LabelTest();
	}
}
*/

public class LabelTest extends Frame{
	Label lab1, lab2, lab3;
	
	LabelTest(){
		super("라벨 연습 프로그램");
		
		lab1 = new Label("첫번째 라벨");
		lab2 = new Label("두번째 라벨");
		lab3 = new Label("세번째 라벨");
		
		setLayout(new FlowLayout());
		add(lab1);
		add(lab2);
		add(lab3);
		
		lab1.setBackground(Color.blue);
		lab2.setBackground(Color.PINK);
		lab3.setBackground(Color.GREEN);
	}
	
	public static void main(String[] args) {
		// TODO Label컴퍼넌트 테스트
		LabelTest labTest = new LabelTest();
		//labTest.setSize(300, 400);
		labTest.setBounds(10, 10, 300, 400);
		labTest.setVisible(true);
	}
}


