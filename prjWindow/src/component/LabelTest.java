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
		lab1 = new Label("ù��° ��");
		lab2 = new Label("�ι�° ��");
		lab3 = new Label("����° ��");
		
		f = new Frame("�� ���� ���α׷�");
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
		// TODO Label���۳�Ʈ �׽�Ʈ
		new LabelTest();
	}
}
*/

public class LabelTest extends Frame{
	Label lab1, lab2, lab3;
	
	LabelTest(){
		super("�� ���� ���α׷�");
		
		lab1 = new Label("ù��° ��");
		lab2 = new Label("�ι�° ��");
		lab3 = new Label("����° ��");
		
		setLayout(new FlowLayout());
		add(lab1);
		add(lab2);
		add(lab3);
		
		lab1.setBackground(Color.blue);
		lab2.setBackground(Color.PINK);
		lab3.setBackground(Color.GREEN);
	}
	
	public static void main(String[] args) {
		// TODO Label���۳�Ʈ �׽�Ʈ
		LabelTest labTest = new LabelTest();
		//labTest.setSize(300, 400);
		labTest.setBounds(10, 10, 300, 400);
		labTest.setVisible(true);
	}
}


